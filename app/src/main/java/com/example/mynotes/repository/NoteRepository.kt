package com.example.mynotes.repository

import com.example.mynotes.db.NoteDatabase
import com.example.mynotes.model.Note

class NoteRepository(private val db: NoteDatabase) {
    fun getNote() = db.getNoteDao().getAllNote();

    fun searchNote(query:String)=db.getNoteDao().searchNote(query);

    suspend fun addNote(note: Note)=db.getNoteDao().addNote(note);

    suspend fun updateNote(note: Note)=db.getNoteDao().updateNote(note);

    suspend fun deleteNote(note: Note)=db.getNoteDao().deleteNote(note);
}