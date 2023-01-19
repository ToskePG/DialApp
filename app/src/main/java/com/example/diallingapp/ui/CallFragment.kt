package com.example.diallingapp.ui

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.diallingapp.databinding.FragmentCallBinding


class CallFragment : Fragment() {

    private var _binding: FragmentCallBinding? = null
    private val binding: FragmentCallBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCallBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners(){
        binding.phoneNumber.addTextChangedListener{
            checkCallButton()
        }
        typeNumbers()
    }


    private fun isNumberEmtpy() = binding.phoneNumber.text.isEmpty()

    private fun checkCallButton(){
        if(isNumberEmtpy())
            disableCallButton()
        else
            enableCallButton()
    }

    @SuppressLint("SetTextI18n")
    private fun typeNumbers(){
        binding.numberZero.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "0"
        }
        binding.numberOne.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "1"
        }
        binding.numberTwo.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "2"
        }
        binding.numberThree.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "3"
        }
        binding.numberFour.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "4"
        }
        binding.numberFive.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "5"
        }
        binding.numberSix.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "6"
        }
        binding.numberSeven.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "7"
        }
        binding.numberEight.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "8"
        }
        binding.numberNine.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "9"
        }
        binding.buttonSharp.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "#"
        }
        binding.buttonSnowflake.setOnClickListener{
            binding.phoneNumber.text = binding.phoneNumber.text.toString() + "*"
        }
        binding.callButton.setOnClickListener{
            makeCall()
        }
    }
    private fun disableCallButton(){
        binding.callButton.setBackgroundColor(Color.GRAY)
        binding.callButton.isEnabled = false
    }
    private fun enableCallButton(){
        binding.callButton.isEnabled = true
    }
    private fun makeCall(){
            Toast.makeText(this.requireActivity(), "Calling ${binding.phoneNumber.text}", Toast.LENGTH_SHORT).show()
    }
}