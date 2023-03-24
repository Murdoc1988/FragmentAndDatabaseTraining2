package com.example.fragmentanddatabasetraining2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import com.example.fragmentanddatabasetraining2.databinding.DirectorListFragmentBinding
import com.example.fragmentanddatabasetraining2.databinding.SubjectListFragmentBinding
import java.util.zip.Inflater

class SubjectListFragment : Fragment() {

    private var _binding: SubjectListFragmentBinding? = null
    private val binding get() = _binding!!
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SubjectListFragmentBinding.inflate(inflater, container, false)

        /*val subjectStringList = viewModel.subjectStringList
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.director_list_dropdown_item_new, subjectStringList)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)*/

        val view = binding.root
        return view
    }
}