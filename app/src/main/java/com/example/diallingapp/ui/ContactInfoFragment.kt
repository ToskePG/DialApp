package com.example.diallingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diallingapp.databinding.FragmentContactInfoBinding
import com.example.diallingapp.ui.adapters.CallAdapter

class ContactInfoFragment : Fragment() {
    private var _binding: FragmentContactInfoBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: CallAdapter
    private val viewModel: CallViewModel by viewModels()
    private val args by navArgs<ContactInfoFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentContactInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners(){
        binding.contactName.text = args.fullName
        binding.contactNumber.text = args.phoneNumber
        binding.backButton.setOnClickListener{
            findNavController().popBackStack()
        }
        initCallRecycler()
    }

    private fun initCallRecycler() {
        adapter = CallAdapter(viewModel.callList){
                call -> Toast.makeText(this.requireActivity(), call.callType, Toast.LENGTH_SHORT).show()
        }
        binding.callRecycler.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
        binding.callRecycler.adapter = adapter
        binding.callRecycler.addItemDecoration(
            DividerItemDecoration(
                this.context,
                DividerItemDecoration.VERTICAL
            )
        )
    }
}