package com.example.fragmentanddatabasetraining2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.fragmentanddatabasetraining2.adapter.StudentAdapter
import com.example.fragmentanddatabasetraining2.data.entities.Student
import com.example.fragmentanddatabasetraining2.databinding.StudentListFragmentBinding

class StudentListFragment : Fragment() {
    private var _binding: StudentListFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = StudentListFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newStudent = Student("Bernd", 5, "Test")
        viewModel.addStudent(newStudent)

        viewModel.studentList.observe(viewLifecycleOwner){
            var adapter = StudentAdapter(viewModel.studentList.value!!)
            binding.studenListRv.adapter = adapter
        }

        activity?.title = "List of Students"
    }


}