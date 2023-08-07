package com.example.netflix.imagesource

import com.example.netflix.R
import com.example.netflix.data.DataSource

class ImageSource {
    fun getAll() : List<DataSource>{
        return listOf(
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
            DataSource(R.drawable.oppenheimer),
        )
    }
}