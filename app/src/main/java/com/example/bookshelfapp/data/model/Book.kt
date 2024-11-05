package com.example.bookshelfapp.data.model

data class Book(
    val title: String,
    val authors: List<String>?,
    val imageLinks: ImageLinks?
)

data class ImageLinks(
    val thumbnail: String?
)

