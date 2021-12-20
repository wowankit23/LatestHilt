package com.test.codeglo.ui.album

import android.content.Intent
import com.test.codeglo.ui.listing.UserAdapter


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
import com.test.codeglo.model.UserAlbum

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

import com.test.codeglo.model.UsersItem
import com.test.codeglo.ui.dilog.UserProfileDialog
import com.test.codeglo.ui.photos.PhotosActivity
import com.test.codeglo.utility.Status
import com.test.codeglo.viewModel.AlbumsActivityViewModel
import com.test.codeglo.viewModel.MainViewModel


/**
 * Shows list of users
 */
@AndroidEntryPoint
class AlbumActivity : AppCompatActivity(),
    AlbumAdapter.UserViewHolder.OnClickedListener {

    private val list = ArrayList<UserAlbum>()
    private var viewModel: AlbumsActivityViewModel? = null
    private lateinit var albumAdapter: AlbumAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        subscribeUi()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(AlbumsActivityViewModel::class.java)

        viewModel!!.getAlbums(1)

        title = "User Albums"
        val layoutManager = LinearLayoutManager(this)
        rvUsers.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(
            rvUsers.context,
            layoutManager.orientation
        )

        rvUsers.addItemDecoration(dividerItemDecoration)
        albumAdapter = AlbumAdapter(this, list)
        rvUsers.adapter = albumAdapter
        albumAdapter.setOnClickListener(this)

    }

    private fun subscribeUi() {


        viewModel!!.userAlbum.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    loading.visibility = View.GONE
                    it.data?.let { users ->
                        albumAdapter.updateData(users)
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


//    override fun onClick(position: Int, user: UsersItem) {
////        val args = Bundle()
////        args.putString("name", user.name)
////        args.putString("email", user.email)
////        args.putString("phone", user.phone)
////        args.putString("address", user.address!!.city)
////
////        args.putInt("id", user.id!!)
////
////        val fragmentManager: FragmentManager = supportFragmentManager
////        val userPopUp = UserProfileDialog()
////        userPopUp!!.arguments = args
////        userPopUp.show(fragmentManager, "user")
//
//
//    }

    override fun onClick(position: Int, model: UserAlbum) {
        val intent = Intent(this, PhotosActivity::class.java)
// To pass any data to next activity
        intent.putExtra("id", model.id)
// start your next activity
        startActivity(intent)
    }

}
