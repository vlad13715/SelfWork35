package com.example.selfwork35

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.selfwork35.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null
    private var counter: Long = 0
    private var incraseCounter: IncraseCounter? = null
    private var counterRepository:CounterRepository?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding?.btnPlusOne?.setOnClickListener() {
            counter += 1
            binding?.tvResult?.text = counter.toString()
            incraseCounter?.invoke(counter)
        }
    }

}