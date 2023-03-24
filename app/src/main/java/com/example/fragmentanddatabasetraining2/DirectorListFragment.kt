package com.example.fragmentanddatabasetraining2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import com.example.fragmentanddatabasetraining2.adapter.DirectorAdapter
import com.example.fragmentanddatabasetraining2.adapter.StudentAdapter
import com.example.fragmentanddatabasetraining2.data.entities.Director
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.data.entities.relations.SchoolAndDirector
import com.example.fragmentanddatabasetraining2.databinding.DirectorListFragmentBinding

class DirectorListFragment : Fragment() {


    private var _binding: DirectorListFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DirectorListFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addDummyData()


        viewModel.directorList.observe(viewLifecycleOwner){
            var adapter = DirectorAdapter(viewModel.directorList.value!!)
            binding.directorListRv.adapter = adapter
        }



        activity?.title = "List of Directors"

    }

    fun addDummyData(){
        var newDirector = Director("Test2", "Test")
        viewModel.addDirector(newDirector)
        newDirector = Director("Test3", "Test")
        viewModel.addDirector(newDirector)
        newDirector = Director("Test4", "Test")
        viewModel.addDirector(newDirector)
        newDirector = Director("Test5", "Test")
        viewModel.addDirector(newDirector)


    }
}