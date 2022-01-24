package com.example.imageapplication.domain.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.imageapplication.common.Constant.UNSPLASH_IMAGE_TABLE
import com.example.imageapplication.data.remote.dto.Urls
import com.example.imageapplication.data.remote.dto.User

@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class ImageData(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val likes: Int,
    @Embedded
    val urls: Urls,
    @Embedded
    val user: User,
)