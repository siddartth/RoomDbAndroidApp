package com.example.roomdbapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdbapp.domain.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase: RoomDatabase() {
    abstract val dao: ContactDao
}