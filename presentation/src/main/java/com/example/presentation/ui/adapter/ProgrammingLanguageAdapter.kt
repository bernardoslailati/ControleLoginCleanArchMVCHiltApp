package com.example.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.domain.model.ProgrammingLanguageModel
import com.example.presentation.databinding.ItemProgrammingLanguageBinding


val DIFF_UTIL = object : DiffUtil.ItemCallback<ProgrammingLanguageModel>() {
    override fun areItemsTheSame(
        oldItem: ProgrammingLanguageModel,
        newItem: ProgrammingLanguageModel,
    ): Boolean {
        return oldItem == newItem
    }
    
    override fun areContentsTheSame(
        oldItem: ProgrammingLanguageModel,
        newItem: ProgrammingLanguageModel,
    ): Boolean {
        return oldItem.name == newItem.name
    }
}

class ProgrammingLanguageAdapter(
    programmingLanguageList: List<ProgrammingLanguageModel> = emptyList()
) :
    ListAdapter<ProgrammingLanguageModel, ProgrammingLanguageAdapter.ViewHolder>(
        DIFF_UTIL
    ) {
    
    init {
        if (programmingLanguageList.isNotEmpty())
            this.submitList(programmingLanguageList)
    }
    
    class ViewHolder(private val itemBinding: ItemProgrammingLanguageBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        
        fun bind(item: ProgrammingLanguageModel) {
            with(itemBinding) {
                tvProgrammingLanguageName.text = item.name
                Glide.with(itemBinding.root).load(item.imageUrl).into(ivProgrammingLanguageImage)
                this.root.setOnClickListener {
                    Toast.makeText(itemBinding.root.context, "${item.name} selecionado!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProgrammingLanguageBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}