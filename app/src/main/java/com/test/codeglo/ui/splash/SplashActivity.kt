package com.test.codeglo.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.test.codeglo.R
import com.test.codeglo.ui.listing.ListingActivity
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {
    private var alpha: Animation? = null
    private var imageViewApartSoftLogo: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        imageViewApartSoftLogo = findViewById(R.id.ivImage)
        alpha = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.animation_alpha)
        ivImage.animation = alpha
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, ListingActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN.toLong())
    }

    companion object {
        private const val SPLASH_SCREEN = 3000
    }
}