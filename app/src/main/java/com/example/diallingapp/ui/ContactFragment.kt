package com.example.diallingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diallingapp.R
import com.example.diallingapp.databinding.FragmentContactBinding
import com.example.diallingapp.ui.adapters.ContactAdapter
import androidx.navigation.fragment.navArgs
import com.example.diallingapp.models.Contact

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ContactAdapter
    private val viewModel: ContactViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       _binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.addContact.setOnClickListener{
            cleanFragment()
            initContactRecycler()
            loadContacts()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        clearBinding()
    }
    private fun clearBinding() {
        _binding = null
    }

    private fun initContactRecycler(){
        adapter = ContactAdapter(viewModel.contactList) {
                contact -> run {
            findNavController().navigate(R.id.action_contactFragment_to_contactInfoFragment)
        }
        }
        binding.contactRecycler.layoutManager = LinearLayoutManager(this.requireActivity(), LinearLayoutManager.VERTICAL, false)
        binding.contactRecycler.adapter = adapter
    }

    private fun loadContacts(){
            binding.contactRecycler.isVisible = true
    }

    private fun cleanFragment(){
        binding.emptyContactScreen.isVisible = false
        binding.addContact.isVisible = false
        binding.contanctInfo.isVisible = false
    }
}