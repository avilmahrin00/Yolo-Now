package com.D121201001.yolonow.Database

import android.content.Context
import com.D121201001.yolonow.Dao.NotesDao
import androidx.room.Room
import androidx.room.RoomDatabase


abstract class NotesDatabase : RoomDatabase() {

    abstract fun myNotesDao() : NotesDao

    companion object {
        @Volatile
        var INSTANCE:  NotesDatabase? = null

        fun getDatabaseInstance(context: Context): NotesDatabase {

            val tempInstnce = INSTANCE
            if (tempInstnce != null) {
                return tempInstnce
            }
            synchronized(this)
            {
                val roomDatabaseInstance =
                    Room.databaseBuilder(context, NotesDatabase::class.java, "Notes").build()
                INSTANCE = roomDatabaseInstance
                return return roomDatabaseInstance
            }
        }
    }
}