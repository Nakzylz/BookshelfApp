package com.example.bookshelfapp.data.repository

import com.example.bookshelfapp.data.model.Book
import com.example.bookshelfapp.data.network.BookApiService

class BookRepository(private val apiService: BookApiService) {

    suspend fun getBooks(): List<Book> {
        val response = apiService.getBooks()
        return response.items.map { it.volumeInfo }
    }
}
