package com.application.film.media_details.domain.repository

import com.application.film.main.domain.models.Media
import com.application.film.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}










