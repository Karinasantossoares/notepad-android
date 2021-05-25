package com.example.register_android.ui.activity


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.register_android.R
import com.example.register_android.databinding.ActivityAuthenticationBinding

class AuthenticationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAuthenticationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_authentication)

    }


    fun setupRegister() {
        binding.imgPadlock.setImageResource(R.drawable.ic_register)
        binding.textWelcome.text = this.getString(R.string.text_register_title)
    }

    fun setupLogin() {
        binding.imgPadlock.setImageResource(R.drawable.ic_person)
        binding.textWelcome.text = this.getString(R.string.text_welcome)
    }


}
