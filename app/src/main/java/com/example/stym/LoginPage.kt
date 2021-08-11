package com.example.stym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stym.databinding.ActivityLoginPageBinding
import com.example.stym.databinding.StymLibraryItemsBinding

class LoginPage : AppCompatActivity() {

    //variable for binding views
    lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loginButtonPress()
    }

    //when button is pressed
    private fun loginButtonPress() {
        binding.buttonLogIn.setOnClickListener{
            logIn()
        }

    }
    //to log into the system
    private fun logIn(){
        val intent = Intent(this,LandingPage::class.java)
        startActivity(intent)
    }
}