package api

import models.NestedJsonModel
import models.Stym
import models.User
import retrofit2.Response
import retrofit2.http.GET

interface StymApi {

    @GET("users")
    suspend fun getUsers(): List<User>


    @GET("db")
    suspend fun getStems(): Response<NestedJsonModel>

    @GET("stems/{id}")
    suspend fun getStemsById(): List<Stym>

    @GET("users/{id}")
    suspend fun getUserById(): List<User>

}