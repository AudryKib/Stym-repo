package com.example.stym

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stym.databinding.ActivityLandingPageBinding
import com.example.stym.databinding.StymLibraryItemsBinding
import models.Message
import models.Stym

private const val TAG = "LandingPage"
class LandingPage : AppCompatActivity() {

    private lateinit var binding: ActivityLandingPageBinding
    private lateinit var binding2: StymLibraryItemsBinding
    private lateinit var viewModel: LandingPageViewModel
    private lateinit var stymAdapter: StymAdapter
    private val stemList = mutableListOf<Stym>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        binding2 = StymLibraryItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val Styms = arrayOf(
//            Stym(
//                1,
//                "Rhytms of the future",
//                "23-12-2020",
//                45,
//                "nfdbodfnrgnregnrug",
//                R.drawable.cds,
//                "This is the description  for Rhytms of the future"
//            ),
//            Stym(
//                1,
//                "Paranormal sounds",
//                "23-12-2020",
//                20,
//                "nfdbodfnrgnregnrug",
//                R.drawable.erik_mclean_9y1ctvke1iy_unsplash,
//                "This is the description  for paranormal sounds"
//            ),
//            Stym(
//                1,
//                "Black Vibes",
//                "23-12-2020",
//                60,
//                "nfdbodfnrgnregnrug",
//                R.drawable.lee_campbell_4f_kk_ayf64_unsplash,
//                "This is the description  for Black Vibes"
//            ),
//            Stym(
//                1,
//                "Rhytms and Sounds",
//                "23-12-2020",
//                35,
//                "nfdbodfnrgnregnrug",
//                R.drawable.mr_zero_ien0d5tlrqi_unsplash,
//                "This is the description  for Rhytms and Sounds"
//            ),
//            Stym(
//                1,
//                "Soul Sounds ",
//                "23-12-2020",
//                80,
//                "This is the description  for Soul Sounds",
//                R.drawable.lee_campbell_4f_kk_ayf64_unsplash,
//                "This is the description  for Soul Sounds"
//            )
//        )

        viewModel = ViewModelProvider(this).get(LandingPageViewModel::class.java)
        viewModel.isLoading.observe(this, Observer { isLoading ->
            Log.i(TAG,"isLoading $isLoading")
        //    binding.progressBar.visibility = if(isLoading) View.VISIBLE else View.GONE
        })

        viewModel.stems.observe(this, Observer { stems ->
            Log.i(TAG, "number of stems: ${stems.size}")
            stemList.addAll(stems)
            stymAdapter.notifyDataSetChanged()
        })

        stymAdapter = StymAdapter(this ,stemList)
        binding.recyclerViewLandingPage.adapter =  stymAdapter
        binding.recyclerViewLandingPage.layoutManager = LinearLayoutManager(this)
        viewModel.getStems()

       // call press share function

        binding2.buttonCreateShare.setOnClickListener {
            onPressShare()
        }

    }
/**
 * When a user presses the share button
 * */
    private fun onPressShare() {
    val message = Message("319-471-4126","Cloud 9 by Swiff")
    val messagePreviewText = """
        Heads up! Something beatiful is coming your way!
        you're receiving ${message.stymName} on Stym App
        click on the link below to access your Gift.
    """.trimIndent()
        //Send message intent
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto: ${message.contactNumber}")  // This ensures only SMS apps respond
            putExtra("sms_body", messagePreviewText)
        }
        startActivity(intent)
    }
}