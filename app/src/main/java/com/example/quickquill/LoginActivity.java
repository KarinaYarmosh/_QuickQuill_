package com.example.quickquill;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextView appNameText;
    private TextView loginText;
    private TextInputEditText loginInputText;
    private TextInputEditText passwordInputText;
    private TextView forgotPasswordClickableText;
    private Button loginButton;
    private TextView registerClickableText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setClickListeners();
    }

    private void initViews() {
        appNameText = findViewById(R.id.title_aplication_name);
        loginText = findViewById(R.id.login_text);
        loginInputText = findViewById(R.id.enterLogin);
        passwordInputText = findViewById(R.id.enterPassword);
        forgotPasswordClickableText = findViewById(R.id.remember_password);
        loginButton = findViewById(R.id.button_register);
        registerClickableText = findViewById(R.id.toLogIn);
    }

    private void setClickListeners() {
        registerClickableText.setOnClickListener(v -> {
            startActivity(RegisterActivity.class);
        });
    }

    private void startActivity(View view) {`
    }