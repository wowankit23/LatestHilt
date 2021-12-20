package com.test.codeglo.ui.listing

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.test.codeglo.R

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

import com.test.codeglo.model.UsersItem
import com.test.codeglo.ui.dilog.UserProfileDialog
import com.test.codeglo.utility.Status
import com.test.codeglo.viewModel.MainViewModel


/**
 * Shows list of users
 */
@AndroidEntryPoint
class ListingActivity : AppCompatActivity(),
    UserAdapter.UserViewHolder.OnClickedListener {

    private val list = ArrayList<UsersItem>()
    private var viewModel: MainViewModel? = null
    private lateinit var userAdapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        subscribeUi()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel!!.getUsers()

        title = "User List"
        val layoutManager = LinearLayoutManager(this)
        rvUsers.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(
            rvUsers.context,
            layoutManager.orientation
        )

        rvUsers.addItemDecoration(dividerItemDecoration)
        userAdapter = UserAdapter(this, list)
        rvUsers.adapter = userAdapter
        userAdapter.setOnClickListener(this)

    }

    private fun subscribeUi() {



        viewModel!!.usersResponse.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    loading.visibility = View.GONE
                    it.data?.let { users ->
                        userAdapter.updateData(users)
                       }
                    rvUsers.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    loading.visibility = View.VISIBLE
                    rvUsers.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    loading.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun showError(msg: String) {
        Snackbar.make(vParent, msg, Snackbar.LENGTH_INDEFINITE).setAction("DISMISS") {
        }.show()
    }



    override fun onClick(position: Int, user: UsersItem) {
        val args = Bundle()
        args.putString("name", user.name)
        args.putString("email", user.email)
        args.putString("phone", user.phone)
        args.putString("address", user.address!!.city)

        args.putInt("id", user.id!!)
        args.putString("lati", user.address.geo!!.lat)
        args.putString("longi", user.address.geo!!.lng)

        val fragmentManager: FragmentManager = supportFragmentManager
        val userPopUp = UserProfileDialog()
        userPopUp!!.arguments = args
        userPopUp.show(fragmentManager, "user")    }

}
