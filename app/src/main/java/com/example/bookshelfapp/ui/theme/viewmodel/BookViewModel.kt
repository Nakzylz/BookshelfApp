package com.example.bookshelfapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.bookshelfapp.data.repository.BookRepository
import com.example.bookshelfapp.data.model.Book
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class BookViewModel @Inject constructor(private val repository: BookRepository) : ViewModel() {

    val books = liveData(Dispatchers.IO) {
        emit(repository.getBooks())
    }
}
