package com.test.codeglo.ui.photos

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.test.codeglo.R
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UserPhoto
import com.test.codeglo.model.UsersItem
import com.test.codeglo.utility.Constants
import kotlinx.android.synthetic.main.list_item_photos.view.*


class PhotosAdapter(private val context: Context, private val list: ArrayList<UserPhoto>) :

    RecyclerView.Adapter<PhotosAdapter.UserViewHolder>() {






    public class UserViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: UserPhoto) {

            itemView.tvTitle.text = item.title
            if (item != null && itemView.progressBar != null && itemView.ivPoster != null) {
                itemView.progressBar.visibility = View.VISIBLE
                itemView.tvTitle.tag = item.id // album Id
                Glide.with(context)
                    .asBitmap()
                    .load(item.thumbnailUrl)
                    .listener(object : RequestListener<Bitmap> {
                        override fun onLoadFailed(e: GlideException?, model: Any, target: com.bumptech.glide.request.target.Target<Bitmap>, isFirstResource: Boolean): Boolean {
                            itemView.progressBar.visibility = View.GONE
                            return false
                        }

                        override fun onResourceReady(resource: Bitmap, model: Any, target: Target<Bitmap>, dataSource: DataSource, isFirstResource: Boolean): Boolean {
                            itemView.progressBar.visibility = View.GONE
                            return false
                        }
                    })

                    .into(itemView.ivPoster)

                //  imageDownloader.download(currentItem.getUrl(), imageView, progressBar);
            }



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_photos, parent, false)

        return UserViewHolder(context, view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])

    }

    fun updateData(userList: ArrayList<UserPhoto>) {
        list.clear()
        val sortedList = userList.sortedBy { user -> user.id }
        list.addAll(sortedList)
        notifyDataSetChanged()
    }






}