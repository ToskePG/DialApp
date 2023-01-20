package com.example.diallingapp.repos

import com.example.diallingapp.models.Call

class CallRepository {
    fun getCalls() : List<Call>{
        return listOf(
            Call("+382 67 000 120", "Apr 24, 14:52", "Missed call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Didn't connect"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Outgoing call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Outgoing call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Incoming call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Incoming call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Missed call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Didn't connect"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Outgoing call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Outgoing call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Incoming call"),
            Call("+382 67 000 120", "Apr 24, 14:52", "Incoming call")
        )
    }
}