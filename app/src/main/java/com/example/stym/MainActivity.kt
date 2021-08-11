package com.example.stym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.stym.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupSpinner()
        setupButton()
    }

    private fun setupSpinner() {
        val user = arrayOf("Select account Type...", "Producer", "User")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, user)
        binding.spinnerUserType.adapter = titleAdapter
    }

    private fun setupButton() {
       binding.buttonCreateAccount.setOnClickListener {
            createAccount()
        }

    }

    private fun createAccount() {
       val user = User(
         binding.spinnerUserType.selectedItem as String,
           binding.editTextFirstName.text.toString(),
           binding.editTextLastName.text.toString(),
           binding.editTextCompany.text.toString() ,
           binding.editTextAddress.text.toString(),
           binding.editTextCity.text.toString(),
           binding.editTextState.text.toString(),
           binding.editTextZipcode.text.toString(),
           binding.editTextPhone.text.toString(),
           binding.editTextEmail.text.toString(),
           binding.editTextPassword.text.toString()
           )

        val intent = Intent(this, LoginPage::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }
}