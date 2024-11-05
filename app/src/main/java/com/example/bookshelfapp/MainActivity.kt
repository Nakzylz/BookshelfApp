package com.example.bookshelfapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import coil.compose.rememberImagePainter
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private lateinit var bookRepository: BookRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // For Manual DI
        bookRepository = AppInjector.provideBookRepository()

        // For Koin DI
        // bookRepository = get()

        setContent {
            lifecycleScope.launch {
                val books = bookRepository.getBooks()
                BookList(books)
            }
        }
    }

    @Composable
    fun BookList(books: List<Book>) {
        LazyColumn {
            items(books) { book ->
                Text(text = book.title)
                book.imageLinks?.thumbnail?.let { url ->
                    Image(painter = rememberImagePainter(url), contentDescription = null)
                }
            }
        }
    }
}

