package com.example.register_android.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.register_android.R
import com.example.register_android.model.NotePad
import com.example.register_android.ui.fragment.ColletionsImageFragment

class AttachmentAdapter(fragment: Fragment, private val listImage:List<String>) : FragmentStateAdapter(fragment) {
    override fun getItemCount() = listImage.size

    override fun createFragment(position: Int) = ColletionsImageFragment()


}