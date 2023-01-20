package com.example.diallingapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diallingapp.databinding.ContactItemBinding
import com.example.diallingapp.models.Contact

class ContactAdapter(
    private var items: List<Contact>,
    private var onItemClickCallback: (Contact) -> Unit
) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactItemBinding.inflate(LayoutInflater.from(parent.context))
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ContactViewHolder(private val binding: ContactItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Contact){
            binding.fullName.text = item.full_name
            binding.phoneNumber.text = item.phone_number
            binding.accountCircle
            binding.contactContainer.setOnClickListener{
                onItemClickCallback(item)
            }
        }
    }
}
