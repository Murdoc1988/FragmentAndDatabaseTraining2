package com.example.fragmentanddatabasetraining2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentanddatabasetraining2.data.entities.Subject
import com.example.fragmentanddatabasetraining2.databinding.SubjectListItemBinding

class SubjectAdapter(var subjectList: LiveData<List<Subject>>): RecyclerView.Adapter<SubjectAdapter.SubjectHolder>(){

    inner class SubjectHolder(val binding: SubjectListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(subject: Subject){
            binding.subjectListItemSubjectNameText.text= subject.subname
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectHolder {
        val binding = SubjectListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubjectHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectHolder, position: Int) {
        holder.bind(subjectList.value!![position])
    }

    override fun getItemCount(): Int {
        return subjectList.value!!.size
    }
}