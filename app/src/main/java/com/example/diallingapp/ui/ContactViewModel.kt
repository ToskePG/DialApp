package com.example.diallingapp.ui

import androidx.lifecycle.ViewModel
import com.example.diallingapp.models.Contact
import com.example.diallingapp.repos.ContactRepository

class ContactViewModel : ViewModel() {
    private val contactRepository = ContactRepository()

    var contactList: ArrayList<Contact> = arrayListOf()
    private fun getContacts(){
        val retrivedContats = contactRepository.getContacts()
        retrivedContats.forEach{ contact ->
            contactList.add(contact)
        }
    }

    init {
        getContacts()
    }
}