package com.example.retrofithttp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofithttp.R
import com.example.retrofithttp.storage.SharedPrefManager

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    override fun onStart() {
        super.onStart()

        if(!SharedPrefManager.getInstance(this).isLoggedIn){
            val intent = Intent(applicationContext, LogInActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}