package com.example.profhwang

import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface WriteService {
    @Multipart
    @POST("")
    fun connectMultiPart(
        @Part image: List<MultipartBody.Part>
    )
}