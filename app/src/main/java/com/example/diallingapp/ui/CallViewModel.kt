package com.example.diallingapp.ui

import androidx.lifecycle.ViewModel
import com.example.diallingapp.models.Call
import com.example.diallingapp.repos.CallRepository

class CallViewModel : ViewModel() {
    private val callRepository = CallRepository()
    var callList: ArrayList<Call> = arrayListOf()
    private fun getCalls(){
        val retrivedCalls = callRepository.getCalls()
        retrivedCalls.forEach{ call ->
            callList.add(call)
        }
    }
}