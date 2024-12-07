package com.aman.contentprovider.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.aman.contentprovider.model.Image

class ImageViewModel:ViewModel() {

    var images by mutableStateOf(emptyList<Image>())
        private set


    fun updateImageList(images: List<Image>){
        this.images = images
    }
}