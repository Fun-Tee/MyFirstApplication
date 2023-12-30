package com.esther.myapplicationp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.esther.myFirstApplication.LoginActivity
import com.esther.myapplication.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton:Button = this.findViewById(R.id.joinNowButton)

        joinButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            this.startActivity(intent)
        }
    }
}