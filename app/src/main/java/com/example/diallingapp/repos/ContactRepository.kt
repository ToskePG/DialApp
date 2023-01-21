package com.example.diallingapp.repos

import com.example.diallingapp.R
import com.example.diallingapp.models.Contact

class ContactRepository {
    fun getContacts() : List<Contact>{
        return listOf<Contact>(
            Contact("Danilo Milkov Tosic", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Lebron James ", "+382 67 225 000", "22-10-2022", R.drawable.account_circle),
            Contact("Steph Curry", "+382 67 999 000", "22-10-2022", R.drawable.account_circle),
            Contact("Pakao Brate Moj", "+382 67 301 000", "22-10-2022", R.drawable.account_circle),
            Contact("Megan Markle", "+382 67 000 458", "22-10-2022", R.drawable.account_circle),
            Contact("Sine Nebojsa", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("The Goat", "+382 67 564 000", "22-10-2022", R.drawable.account_circle),
            Contact("Sasa Matic", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Sef Sale", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Leo Messi", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Eva Ras", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Betman", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Ne Znam Vise", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Haribo", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Zorana", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Lorem Ipsum", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Duznik 1", "+382 67 000 000", "22-10-2022", R.drawable.account_circle),
            Contact("Duznik 2", "+382 67 000 345", "22-10-2022", R.drawable.account_circle),
            Contact("Duznik 3", "+382 67 345 000", "22-10-2022", R.drawable.account_circle),
            Contact("Zelenasi", "+382 67 000 253", "22-10-2022", R.drawable.account_circle),
            Contact("Fudbalski Termini", "+382 69 234 235", "22-10-2022", R.drawable.account_circle),
            Contact("Ivica Dacic", "+382 68 000 200", "22-10-2022", R.drawable.account_circle),
            Contact("Sivi Soko", "+382 67 345 000", "22-10-2022", R.drawable.account_circle),
            Contact("Pg Taxi", "19714", "22-10-2022", R.drawable.account_circle)
        )
    }
}