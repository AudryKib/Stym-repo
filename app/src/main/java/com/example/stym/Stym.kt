package com.example.stym

import java.io.Serializable
import java.util.*

data class Stym(
val stymId : Int,
val name : String,
val creationDate : String,
val numberOfTracks : Int,
val stym : String,
val artWork : Int,
val Description: String
): Serializable
