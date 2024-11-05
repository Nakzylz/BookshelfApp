package com.example.bookshelfapp.data.model

data class BookResponse(
    val items: List<BookItem>
)

data class BookItem(
    val volumeInfo: Book
)
