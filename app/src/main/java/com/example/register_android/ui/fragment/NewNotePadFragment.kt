package com.example.register_android.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.register_android.R
import com.example.register_android.databinding.FragmentNewNotePadBinding
import com.example.register_android.ui.adapter.AttachmentAdapter
import com.example.register_android.viewModel.NotePadViewModel
import org.koin.android.viewmodel.ext.android.sharedViewModel


class NewNotePadFragment : Fragment() {
    private lateinit var binding: FragmentNewNotePadBinding
    private val viewModel: NotePadViewModel by sharedViewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewNotePadBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel.imageAttchamentNotePad.observe(viewLifecycleOwner, Observer {
            binding.viewPager.adapter = AttachmentAdapter(this, it)
        })
    }
}