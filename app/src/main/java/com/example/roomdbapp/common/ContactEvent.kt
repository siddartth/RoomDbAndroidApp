package com.example.roomdbapp.common

import com.example.roomdbapp.domain.Contact
import com.example.roomdbapp.ui.view.SortType

sealed interface ContactEvent {
    object SaveContact: ContactEvent
    data class DeleteContact(val contact: Contact): ContactEvent
    data class SetFirstName(val firstName: String): ContactEvent
    data class SetLastName(val lastName: String): ContactEvent
    data class SetPhoneNumber(val phoneNumber: String): ContactEvent
    object ShowDialog: ContactEvent
    object HideDialog: ContactEvent
    data class SortContact(val sortType: SortType): ContactEvent
}