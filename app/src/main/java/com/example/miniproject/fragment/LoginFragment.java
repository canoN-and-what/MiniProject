package com.example.miniproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.miniproject.R;
import com.example.miniproject.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            String email = binding.inputEmail.getInputText();
            String password = binding.inputPassword.getInputText();
            Toast.makeText(getContext(), "email: " + email + " password: " + password, Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}