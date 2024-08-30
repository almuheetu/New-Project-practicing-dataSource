package com.example.practiceprojectaboutdatasource

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.practiceprojectaboutdatasource.databinding.FragmentEmployeeBinding

class EmployeeFragment : Fragment() {
    private lateinit var binding: FragmentEmployeeBinding
    private val employee = employeeList


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmployeeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.employeeFirstBtn.setOnClickListener {
            val action =
                EmployeeFragmentDirections.actionEmployeeFragmentToEmployeeDetailsFragment(employee[0])
            findNavController().navigate(action)
        }
        binding.employeeSecondBtn.setOnClickListener {
            val action =
                EmployeeFragmentDirections.actionEmployeeFragmentToEmployeeDetailsFragment(employee[1])
            findNavController().navigate(action)
        }

        binding.employeeThirdBtn.setOnClickListener {
            val action =
                EmployeeFragmentDirections.actionEmployeeFragmentToEmployeeDetailsFragment(employee[2])
            findNavController().navigate(action)
        }

        binding.employeeForthBtn.setOnClickListener {
            val action =
                EmployeeFragmentDirections.actionEmployeeFragmentToEmployeeDetailsFragment(employee[3])
            findNavController().navigate(action)
        }

    }


}