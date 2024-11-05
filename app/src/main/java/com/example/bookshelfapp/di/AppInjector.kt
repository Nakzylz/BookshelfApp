package com.example.bookshelfapp.di

import com.example.bookshelfapp.data.network.BookApiService
import com.example.bookshelfapp.data.repository.BookRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppInjector {

    // Retrofit instance
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://www.googleapis.com/books/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Create ApiService
    private val bookApiService: BookApiService = retrofit.create(BookApiService::class.java)

    // Create BookRepository
    fun provideBookRepository(): BookRepository {
        return BookRepository(bookApiService)
    }
}
