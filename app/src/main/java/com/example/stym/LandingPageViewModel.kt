package com.example.stym

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import api.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import models.Stym

private const val  TAG = "LandingPageViewModel"
class LandingPageViewModel : ViewModel() {

    private  val _stems: MutableLiveData<List<Stym>> = MutableLiveData()
    val stems: LiveData<List<Stym>>
    get() = _stems

    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean>
    get() = _isLoading



    fun getStems(){
        viewModelScope.launch{
            val response =  RetrofitInstance.api.getStems()
            val fetchedStems: MutableList<Stym> = mutableListOf()
             withContext(Dispatchers.Main){
                 if(response.isSuccessful){

                     val items = response.body()?.stems
                     if (items != null) {
                         for(i in 0 until items.count()){
                           fetchedStems.add(items[i])
                         }
                     }
                 }


             }


            Log.i(TAG, "fetched stems: $stems")
             _stems.value = fetchedStems
         }
    }
}