package com.example.register_android.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.register_android.R
import com.example.register_android.databinding.FragmentLoginBinding
import com.example.register_android.ui.activity.AuthenticationActivity

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AuthenticationActivity).setupLogin()

        binding.messageResgister.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentHome_to_registerFragment)
        }

        binding.btnEnterLogin.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentoLogin_to_notePadActivity)
        }
    }
}