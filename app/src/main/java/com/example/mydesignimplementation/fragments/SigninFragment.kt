package com.example.mydesignimplementation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mydesignimplementation.R
import com.example.mydesignimplementation.databinding.FragmentSigninBinding

class SigninFragment : Fragment() {

    private var _binding : FragmentSigninBinding? = null
    private val binding get() = _binding!!
    private var navCon: NavController? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSigninBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signInButton.setOnClickListener {
            navCon?.navigate(R.id.action_signinFragment_to_splashScreenFragment)
        }
        binding.accountSetup.setOnClickListener {
            navCon?.navigate(R.id.action_signinFragment_to_signupFragment)
        }
    }
}