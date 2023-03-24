package com.example.fragmentanddatabasetraining2.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.databinding.DirectorListItemBinding

class DirectorAdapter(var directorList: List<Director>): RecyclerView.Adapter<DirectorAdapter.DirectorHolder>() {

    inner class DirectorHolder(val binding: DirectorListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(director: Director){
            binding.directorListItemDirectorNameText.text = director.dname
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DirectorHolder {
        val binding = DirectorListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DirectorHolder(binding)
    }

    override fun onBindViewHolder(holder: DirectorHolder, position: Int) {
        holder.bind(directorList[position])
    }

    override fun getItemCount(): Int {
        return directorList.size
    }
}