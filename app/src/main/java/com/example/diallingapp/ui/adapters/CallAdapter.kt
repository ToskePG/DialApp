package com.example.diallingapp.ui.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diallingapp.databinding.CallItemBinding
import com.example.diallingapp.models.Call

class CallAdapter(
    private var callItems: List<Call>,
    private var onItemClickCallback: (Call) -> Unit
) : RecyclerView.Adapter<CallAdapter.CallViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallViewHolder {
        val binding = CallItemBinding.inflate(LayoutInflater.from(parent.context))
        return CallViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CallViewHolder, position: Int) {
        holder.bind(callItems[position])
    }

    override fun getItemCount(): Int = callItems.size

    inner class CallViewHolder(private val binding: CallItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: Call){
            if(binding.callType.text == "Missed call"){
                binding.callTime.setTextColor(Color.parseColor("#FF0000"))
            }
            binding.callNumber.text = item.callNumber
            binding.callTime.text = item.callTime
            binding.callType.text = item.callType
            binding.callHistory.setOnClickListener{
                onItemClickCallback(item)
            }
        }
    }
}