package com.example.mynotes.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mynotes.R
import com.example.mynotes.databinding.ActivityMainBinding
import com.example.mynotes.db.NoteDatabase
import com.example.mynotes.repository.NoteRepository
import com.example.mynotes.viewModel.NoteActivityViewModeFactory
import com.example.mynotes.viewModel.NoteActivityViewModel
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var noteActivityViewModel: NoteActivityViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        binding= ActivityMainBinding.inflate(layoutInflater)


        try {
            setContentView(binding.root)
            val noteRepository = NoteRepository(NoteDatabase(this))
            val noteActivityViewModeFactory=NoteActivityViewModeFactory(noteRepository)
            noteActivityViewModel = ViewModelProvider(
                this , noteActivityViewModeFactory
            )[NoteActivityViewModel::class.java]

        }catch (e: Exception) {
            Log.d("TAG" , "Error")
        }

    }
}