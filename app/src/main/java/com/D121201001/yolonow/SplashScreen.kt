package com.D121201001.yolonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide() // Hide Action Bar

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            //code here
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000)
    }
}