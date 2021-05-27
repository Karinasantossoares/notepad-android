package com.example.register_android.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.register_android.R
import com.example.register_android.databinding.FragmentColletionsImageBinding
import com.example.register_android.databinding.FragmentNewNotePadBinding


class ColletionsImageFragment : Fragment() {
    private lateinit var binding :FragmentColletionsImageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentColletionsImageBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}