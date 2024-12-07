package com.aman.contentprovider.model

import android.net.Uri

data class Image(
    val id:Long,
    val name:String,
    val uri: Uri
)
