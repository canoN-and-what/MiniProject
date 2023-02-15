package com.example.miniproject.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.example.miniproject.R;
import com.example.miniproject.databinding.ViewInputFeildBinding;

public class InputField extends LinearLayout {

    com.example.miniproject.databinding.ViewInputFeildBinding binding;

    public InputField(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public InputField(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs){
        binding = ViewInputFeildBinding.inflate(LayoutInflater.from(getContext()), this,true);
        TypedArray attributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.InputField, 0, 0);
        try{
            String title = attributes.getString(R.styleable.InputField_title);
            binding.title.setText(title);
            int inputType = attributes.getInt(R.styleable.InputField_android_inputType, InputType.TYPE_NULL);
            binding.input.setInputType(inputType);
        }
        finally {
            attributes.recycle();
        }
    }
    public String getInputText(){
        return binding.input.getText().toString();
    }
}
