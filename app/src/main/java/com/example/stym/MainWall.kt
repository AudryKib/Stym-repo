package com.example.stym

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stym.databinding.ActivityMainWallBinding
import models.User


class MainWall : AppCompatActivity() {

    lateinit var user : User
    private lateinit var binding: ActivityMainWallBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainWallBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        retrieveUser()
        displayUser()
        setupClicklisteners()
    }


    private fun retrieveUser() {
      user = intent.getSerializableExtra("User") as User
    }

    private fun displayUser() {
        binding.textViewFullname.text = user.getFullName()
        binding.textViewAddress.text = user.Address()
        binding.textViewEmail.text = user.email
        binding.textViewPhone.text = user.phone
    }
    private fun setupClicklisteners() {
       binding.textViewEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:${user.email}")
            startActivity(intent)
        }

        binding.textViewPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${user.phone}")
            startActivity(intent)
        }
    }

}