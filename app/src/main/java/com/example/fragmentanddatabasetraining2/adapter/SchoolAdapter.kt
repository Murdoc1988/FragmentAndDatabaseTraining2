package com.example.fragmentanddatabasetraining2.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentanddatabasetraining2.R
import com.example.fragmentanddatabasetraining2.SchoolListFragment
import com.example.fragmentanddatabasetraining2.SchoolListFragmentDirections
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.databinding.SchoolListItemBinding

class SchoolAdapter(var schoolList: List<School>): RecyclerView.Adapter<SchoolAdapter.SchoolHolder>() {

    inner class SchoolHolder(val binding: SchoolListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(school: School){
            binding.schoolListItemSchoolNameText.text = school.sname
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchoolHolder {
        val binding = SchoolListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return SchoolHolder(binding)
    }

    override fun onBindViewHolder(holder: SchoolHolder, position: Int) {
        holder.bind(schoolList[position])

        holder.binding.schoolListItemSchoolNameText.setOnClickListener {
            var navController = Navigation.findNavController(holder.itemView)
            navController.navigate(R.id.school_list2director_list)

            //--> Abbruch
            //it.findNavController().navigate(R.id.school_list2director_list, schoolList[position])
            //-->Abbruch
            //Navigation.findNavController(it).navigate(SchoolListFragmentDirections.schoolList2directorList(schoolList[position]))
            //-->Abbruch
            //holder.itemView.findNavController().navigate(R.id.school_list2director_list)

            //Fehlermeldung: "java.lang.IllegalStateException: View androidx.constraintlayout.widget.ConstraintLayout{4f2f66a V.E...... ........ 0,0-1125,1840} does not have a NavController set"
        }

    }

    override fun getItemCount(): Int {
        return schoolList.size
    }
}