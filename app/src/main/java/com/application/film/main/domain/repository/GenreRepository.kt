package com.application.film.main.domain.repository

import com.application.film.util.Resource
import com.application.film.main.domain.models.Genre
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}










