package com.example.diallingapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diallingapp.databinding.FragmentContactBinding
import com.example.diallingapp.ui.adapters.ContactAdapter

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ContactAdapter
    private val viewModel: ContactViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initContactRecycler()
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
                //contact -> findNavController().navigate(R.id.action_contactFragment_to_contactInfoFragment)
        }
        binding.contactRecycler.layoutManager = LinearLayoutManager(this.requireActivity(), LinearLayoutManager.VERTICAL, false)
        binding.contactRecycler.adapter = adapter
    }
}