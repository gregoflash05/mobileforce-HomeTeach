package com.mobileforce.hometeach.data.repository

import com.mobileforce.hometeach.data.sources.remote.wrappers.TutorDetailsResponse
import com.mobileforce.hometeach.data.sources.remote.wrappers.UploadResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response

interface TutorRepository {
    suspend fun getTutorDetails(): TutorDetailsResponse

    suspend fun uploadTutorMedia(id: RequestBody,
                                 profile_pic: MultipartBody.Part,
                                 credentials: MultipartBody.Part,
                                 video: MultipartBody.Part): Response<UploadResponse>

    suspend fun getId():String
}