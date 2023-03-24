package com.example.fragmentanddatabasetraining2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LiveData
import com.example.fragmentanddatabasetraining2.adapter.SchoolAdapter
import com.example.fragmentanddatabasetraining2.data.entities.School
import com.example.fragmentanddatabasetraining2.databinding.SchoolListFragmentBinding

class SchoolListFragment : Fragment() {

    private var _binding: SchoolListFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SchoolListFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.schoolList.observe(viewLifecycleOwner){
            var adapter = SchoolAdapter(viewModel.schoolList.value!!)
            binding.schoolListRv.adapter = adapter
        }

        activity?.title = "List of School"
    }

}