package com.example.roomdbapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.roomdbapp.domain.Contact

@Dao
interface ContactDao {

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Upsert
    suspend fun upsertContact(contact: Contact)

    @Query("SELECT * FROM contact ORDER BY firstName ASC")
    fun getOrdersByFirstName(): List<Contact>

    @Query("SELECT * FROM contact ORDER BY lastName ASC")
    fun getOrdersByLastName(): List<Contact>

    @Query("SELECT * FROM contact ORDER BY phoneNumber ASC")
    fun getOrdersByPhoneNumber(): List<Contact>
}