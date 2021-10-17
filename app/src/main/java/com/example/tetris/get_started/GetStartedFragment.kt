package com.example.tetris.get_started

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tetris.R
import com.example.tetris.databinding.GetStartedFragmentBinding

class GetStartedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: GetStartedFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.get_started_fragment, container, false
        )

        binding.startButton.setOnClickListener {
            findNavController().navigate(GetStartedFragmentDirections.actionGetStartedToGame())
        }
        return binding.root
    }


}