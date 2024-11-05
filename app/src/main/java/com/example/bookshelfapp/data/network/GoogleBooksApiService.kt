package com.example.bookshelfapp.data.network

import com.example.bookshelfapp.data.model.BookResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GoogleBooksApiService {

    @GET("volumes")
    suspend fun getBooks(
        @Query("q") query: String = "android",
        @Query("maxResults") maxResults: Int = 10
    ): BookResponse
}
