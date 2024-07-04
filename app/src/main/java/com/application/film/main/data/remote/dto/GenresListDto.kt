package com.application.film.main.data.remote.dto

import com.application.film.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)