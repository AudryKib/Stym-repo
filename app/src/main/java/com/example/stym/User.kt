package com.example.stym

import java.io.Serializable

data class User(
    val user_type: String,
    val firstName: String,
    val lastName: String,
    val company: String,
    val address: String,
    val city: String,
    val state: String,
    val zipcode: String,
    val phone: String,
    val email: String,
    val password: String,

    ):Serializable{

    fun getFullName() =" $user_type $firstName $lastName"
    fun Address() = "$address $city $state $zipcode"

    }


