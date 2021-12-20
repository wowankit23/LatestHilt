package com.test.codeglo.ui.album

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.codeglo.R
import com.test.codeglo.model.UserAlbum
import com.test.codeglo.model.UsersItem
import com.test.codeglo.utility.Constants
import kotlinx.android.synthetic.main.list_item_album.view.*




class AlbumAdapter(private val context: Context, private val list: ArrayList<UserAlbum>) :

    RecyclerView.Adapter<AlbumAdapter.UserViewHolder>() {

    private var onClickListener: UserViewHolder.OnClickedListener? = null

    fun setOnClickListener(onClickListener: UserViewHolder.OnClickedListener){
        this.onClickListener = onClickListener
    }



    public class UserViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
       interface OnClickedListener{
           fun onClick(position: Int, model: UserAlbum)
       }
        fun bind(item: UserAlbum) {

            itemView.tvItem.text = item.title



        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_album, parent, false)

        return UserViewHolder(context, view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {

            onClickListener?.onClick(position,list[position])


        }
    }

    fun updateData(userList: ArrayList<UserAlbum>) {
        list.clear()
        val sortedList = userList.sortedBy { user -> user.id }
        list.addAll(sortedList)
        notifyDataSetChanged()
    }






}