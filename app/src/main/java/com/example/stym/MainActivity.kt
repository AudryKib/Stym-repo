package com.example.stym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupSpinner()
        setupButton()
    }

    private fun setupSpinner() {
        val user = arrayOf("Select account Type...", "Producer", "User")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, user)
        spinner_user_type.adapter = titleAdapter
    }

    private fun setupButton() {
        button_create_account.setOnClickListener {
            createAccount()
        }

    }

    private fun createAccount() {
       val user = User(
           spinner_user_type.selectedItem as String,
           text_input_first_name.text.toString(),
           text_input_last_name.text.toString(),
           text_input_company.text.toString() ,
           text_input_address.text.toString(),
           text_input_city.text.toString(),
           text_input_state.text.toString(),
           text_input_zipcode.text.toString(),
           text_input_phone.text.toString(),
           text_input_email.text.toString(),
           text_input_password.text.toString()
           )

        val intent = Intent(this, MainWall::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }
}