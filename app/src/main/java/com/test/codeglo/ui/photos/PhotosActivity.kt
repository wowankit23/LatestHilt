package com.test.codeglo.ui.photos

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
import com.test.codeglo.model.UserPhoto

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

import com.test.codeglo.model.UsersItem
import com.test.codeglo.ui.dilog.UserProfileDialog
import com.test.codeglo.utility.Status
import com.test.codeglo.viewModel.AlbumsActivityViewModel
import com.test.codeglo.viewModel.MainViewModel
import com.test.codeglo.viewModel.PhotosActivityViewModel


/**
 * Shows list of users
 */
@AndroidEntryPoint
class PhotosActivity : AppCompatActivity(){

    private val list = ArrayList<UserPhoto>()
    private var viewModel: PhotosActivityViewModel? = null
    private lateinit var photoAdapter: PhotosAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        subscribeUi()
    }

    private fun init() {
        viewModel = ViewModelProvider(this).get(PhotosActivityViewModel::class.java)

        viewModel!!.getPhotos(4)

        title = "Albums Photos"
        val layoutManager = LinearLayoutManager(this)
        rvUsers.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(
            rvUsers.context,
            layoutManager.orientation
        )

        rvUsers.addItemDecoration(dividerItemDecoration)
        photoAdapter = PhotosAdapter(this, list)
        rvUsers.adapter = photoAdapter

    }

    private fun subscribeUi() {



        viewModel!!.userPhoto.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    loading.visibility = View.GONE
                    it.data?.let { users ->
                        photoAdapter.updateData(users)
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




}
