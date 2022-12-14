package com.D121201001.yolonow.Repository

import androidx.lifecycle.LiveData
import com.D121201001.yolonow.Dao.NotesDao
import com.D121201001.yolonow.Model.Notes


class NotesRepository(val dao: NotesDao) {

    fun getAllNotes() : LiveData<List<Notes>> {
        return dao.getNotes()
    }

    fun insertNotes(notes: Notes) {
        dao.insertNotes(notes)
    }

    fun deleteNotes(id: Int) {
        dao.deleteNotes(id)
    }

    fun updateNotes(notes: Notes) {
        dao.updateNotes(notes)
    }
}