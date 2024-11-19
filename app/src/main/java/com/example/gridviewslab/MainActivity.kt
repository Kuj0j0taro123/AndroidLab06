package com.example.gridviewslab

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gridviewslab.adapter.ImageGridAdapter
import com.squareup.picasso.Picasso
import kotlinx.coroutines.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)


        val imageList = listOf(
            "http://cti.ubm.ro/cmo/digits/img0.jpg",
            "http://cti.ubm.ro/cmo/digits/img1.jpg",
            "http://cti.ubm.ro/cmo/digits/img2.jpg",
            "http://cti.ubm.ro/cmo/digits/img3.jpg",
            "http://cti.ubm.ro/cmo/digits/img4.jpg",
            "http://cti.ubm.ro/cmo/digits/img5.jpg",
            "http://cti.ubm.ro/cmo/digits/img6.jpg",
            "http://cti.ubm.ro/cmo/digits/img7.jpg",
            "http://cti.ubm.ro/cmo/digits/img8.jpg"
        )

        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = ImageGridAdapter(imageList)
    }

}

