package com.test.codeglo.ui.listing

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.test.codeglo.R
import com.test.codeglo.model.UsersItem
import com.test.codeglo.utility.Constants
import kotlinx.android.synthetic.main.list_item_user.view.*




class UserAdapter(private val context: Context, private val list: ArrayList<UsersItem>) :

    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var onClickListener: UserViewHolder.OnClickedListener? = null

    fun setOnClickListener(onClickListener: UserViewHolder.OnClickedListener){
        this.onClickListener = onClickListener
    }



    public class UserViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
       interface OnClickedListener{
           fun onClick(position: Int, model: UsersItem)
       }
        fun bind(user: UsersItem) {

            itemView.tvName.text = user.name
            Glide.with(context).load(Constants.IMAGE_URL)
                .apply(RequestOptions().override(400, 400).centerInside().placeholder(R.drawable.placehoder)).into(itemView.ivPoster)
            itemView.tvEmail.text = user.email
            itemView.tvPhone.text=user.phone


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_user, parent, false)

        return UserViewHolder(context, view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {

            onClickListener?.onClick(position,list[position])


        }
    }

    fun updateData(userList: ArrayList<UsersItem>) {
        list.clear()
        val sortedList = userList.sortedBy { user -> user.name }
        list.addAll(sortedList)
        notifyDataSetChanged()
    }






}