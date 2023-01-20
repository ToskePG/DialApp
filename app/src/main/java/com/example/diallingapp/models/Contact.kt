package com.example.diallingapp.models

import androidx.annotation.DrawableRes

data class Contact (
    val full_name: String,
    val phone_number: String,
    val last_call: String,
    @DrawableRes val imageResourceId: Int
)