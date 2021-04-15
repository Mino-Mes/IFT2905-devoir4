package com.example.devoir4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    private Button next;
    private TextView back;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        next = findViewById(R.id.connectButton);
        back = findViewById(R.id.backButton);

        back.setOnClickListener(v -> {
            Intent myIntent = new Intent(SignUp.this, MainActivity.class);
            SignUp.this.startActivity(myIntent);
        });


        connectButton = findViewById(R.id.connectButton);
        connectButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(SignUp.this, User.class);
            SignUp.this.startActivity(myIntent);
        });

    }
}