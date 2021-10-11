package com.example.stym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stym.databinding.ActivityLandingPageBinding
import models.Stym

class LandingPage : AppCompatActivity() {

    private lateinit var binding: ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Styms = arrayOf(
            Stym(
                1,
                "Rhytms of the future",
                "23-12-2020",
                45,
                "nfdbodfnrgnregnrug",
                R.drawable.cds,
                "This is the description  for Rhytms of the future"
            ),
            Stym(
                1,
                "Paranormal sounds",
                "23-12-2020",
                20,
                "nfdbodfnrgnregnrug",
                R.drawable.erik_mclean_9y1ctvke1iy_unsplash,
                "This is the description  for paranormal sounds"
            ),
            Stym(
                1,
                "Black Vibes",
                "23-12-2020",
                60,
                "nfdbodfnrgnregnrug",
                R.drawable.lee_campbell_4f_kk_ayf64_unsplash,
                "This is the description  for Black Vibes"
            ),
            Stym(
                1,
                "Rhytms and Sounds",
                "23-12-2020",
                35,
                "nfdbodfnrgnregnrug",
                R.drawable.mr_zero_ien0d5tlrqi_unsplash,
                "This is the description  for Rhytms and Sounds"
            ),
            Stym(
                1,
                "Soul Sounds ",
                "23-12-2020",
                80,
                "This is the description  for Soul Sounds",
                R.drawable.lee_campbell_4f_kk_ayf64_unsplash,
                "This is the description  for Soul Sounds"
            )
        )

        binding.recyclerViewLandingPage.adapter = StymAdapter(Styms)
        binding.recyclerViewLandingPage.layoutManager = LinearLayoutManager(this)

       // call press share function
     //   onPressShare()


    }
/**
 * When a user presses the share button
 * */
    private fun onPressShare() {
        TODO("Not yet implemented")
    }
}