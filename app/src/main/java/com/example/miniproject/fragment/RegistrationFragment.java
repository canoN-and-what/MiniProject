package com.example.miniproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.miniproject.R;
import com.example.miniproject.databinding.FragmentLoginBinding;
import com.example.miniproject.databinding.FragmentRegistrationBinding;

public class RegistrationFragment extends Fragment {

    private FragmentRegistrationBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            String email = binding.inputEmail.getInputText();
            String password = binding.inputPassword.getInputText();
            String confirmedPassword = binding.confirmInputPassword.getInputText();
            String nickName = binding.nickname.getInputText();
            Toast.makeText(getContext(), "email: " + email
                            + " password: " + password
                            + " confirmed password: " + confirmedPassword
                            + " nickname: " + nickName,
                            Toast.LENGTH_LONG).show();
        });
        return binding.getRoot();
    }
}