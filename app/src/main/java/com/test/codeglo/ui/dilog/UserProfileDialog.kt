package com.test.codeglo.ui.dilog


import android.annotation.SuppressLint
import android.app.DialogFragment
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import com.test.codeglo.R
import com.test.codeglo.ui.album.AlbumActivity
import com.test.codeglo.ui.maps.MapsActivity


public class UserProfileDialog : androidx.fragment.app.DialogFragment() {
    private var ivPoster:ImageView?=null

    private var tvName:TextView?=null
    private var tvEmail:TextView?=null
    private var tvPhone:TextView?=null
    private var tvAddress:TextView?=null
    private var tvViewAlbum:TextView?=null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.MyMiddleDialogStyle)
    }

    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val view: View = inflater.inflate(R.layout.user_profile, container)
        val mArgs = arguments
        ivPoster=view.findViewById(R.id.ivPoster)

        tvName=view.findViewById(R.id.tvName)
        tvEmail=view.findViewById(R.id.tvEmail)
        tvPhone=view.findViewById(R.id.tvPhone)
        tvAddress=view.findViewById(R.id.tvAddress)
        tvViewAlbum=view.findViewById(R.id.tvAlbum)

        tvName!!.text=mArgs!!.getString("name")
        tvEmail!!.text=mArgs!!.getString("email")
        tvPhone!!.text=mArgs!!.getString("phone")
        tvAddress!!.text=mArgs!!.getString("address")
        ivPoster!!.setOnClickListener {

        }
        tvViewAlbum!!.setOnClickListener {
            val intent = Intent(activity, AlbumActivity::class.java)

            startActivity(intent)
            dismiss()
        }
        tvAddress!!.setOnClickListener {
            val intent = Intent(activity, MapsActivity::class.java)
            intent.putExtra("LAT", mArgs!!.getString("lati"));
            intent.putExtra("LONGI", mArgs!!.getString("longi"));
            startActivity(intent)
            dismiss()

        }


        return view
    }

    override fun onStart() {
        super.onStart()
        dialog!!.setCanceledOnTouchOutside(true)
    }

}