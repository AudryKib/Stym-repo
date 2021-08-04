package com.example.stym

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_wall.*

class MainWall : AppCompatActivity() {

    lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_wall)
        retrieveUser()
        displayUser()
        setupClicklisteners()
    }


    private fun retrieveUser() {
      user = intent.getSerializableExtra("User") as User
    }

    private fun displayUser() {
        text_view_fullname.text = user.getFullName()
        text_view_address.text = user.Address()
        text_view_email.text = user.email
        text_view_phone.text = user.phone
    }
    private fun setupClicklisteners() {
        text_view_email.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:${user.email}")
            startActivity(intent)
        }

        text_view_phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${user.phone}")
            startActivity(intent)
        }
    }

}