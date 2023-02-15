package com.example.miniproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.miniproject.R;
import com.example.miniproject.adapters.EnterPagerAdapter;
import com.example.miniproject.databinding.ActivityEnterBinding;

public class EnterActivity extends AppCompatActivity {

    ActivityEnterBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Thread(() ->{
            try {
                Thread.sleep(300);
                runOnUiThread(() ->{
                    binding.mainIcon.setVisibility(View.VISIBLE);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        binding.pager.setAdapter(new EnterPagerAdapter(getSupportFragmentManager()));
        binding.tabs.setupWithViewPager(binding.pager);
    }
}