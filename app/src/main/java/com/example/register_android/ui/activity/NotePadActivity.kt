package com.example.register_android.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.register_android.R
import com.example.register_android.databinding.ActivityNotePadBinding

class NotePadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotePadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_note_pad)
    }

    override fun onSupportNavigateUp() = findNavController(R.id.myNavHostFragment).navigateUp()
}