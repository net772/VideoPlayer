package com.example.videoapp.service

import com.example.videoapp.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/ab518f60-b6c1-46fd-be0c-e3f68063b606")
    fun listVideos(): Call<VideoDto>
}