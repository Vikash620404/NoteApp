package com.example.mynotes.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mynotes.repository.NoteRepository

class NoteActivityViewModeFactory(private val repository: NoteRepository):
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteActivityViewModel(repository) as T
    }
}