package com.example.fragmentanddatabasetraining2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.databinding.StudentListItemBinding

class StudentAdapter(var studentList: List<Student>): RecyclerView.Adapter<StudentAdapter.StudentHolder>() {

    inner class StudentHolder(val binding: StudentListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(student: Student){
            binding.studentListItemStudentNameText.text = student.stname
            binding.studentListItemSemeterText.text = student.stsem.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        val binding =StudentListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return StudentHolder(binding)
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        var student: Student = studentList[position]
        holder.bind(studentList[position])
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}