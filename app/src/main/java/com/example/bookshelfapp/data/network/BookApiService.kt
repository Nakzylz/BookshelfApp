package com.example.bookshelfapp.data.network

import com.example.bookshelfapp.data.model.BookResponse
import retrofit2.http.GET

interface BookApiService {

    @GET("volumes?q=android")
    suspend fun getBooks(): BookResponse
}
