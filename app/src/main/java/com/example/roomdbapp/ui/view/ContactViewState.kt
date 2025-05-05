package com.example.roomdbapp.ui.view

import com.example.roomdbapp.domain.Contact

data class ContactViewState(
    val contacts: List<Contact> = emptyList(),
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val isAddingContact: Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME
)

enum class SortType {
    FIRST_NAME,
    LAST_NAME,
    PHONE_NUMBER
}