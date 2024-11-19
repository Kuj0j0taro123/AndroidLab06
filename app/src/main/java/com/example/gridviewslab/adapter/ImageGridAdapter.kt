package com.example.gridviewslab.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.gridviewslab.R
import com.squareup.picasso.Picasso

class ImageGridAdapter(private val imageList: List<String>) : RecyclerView.Adapter<ImageGridAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val imageUrl = imageList[position]
        Picasso.get().load(imageUrl).into(holder.imageView) // Use Glide if preferred
    }

    override fun getItemCount() = imageList.size
}
