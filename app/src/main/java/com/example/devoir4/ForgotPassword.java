package com.example.devoir4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {

    private TextView backButton;
    private Button sendEmail;
    private Button connect;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        backButton =  findViewById(R.id.backButton);
        sendEmail = findViewById(R.id.sendEmailButon);
        connect = findViewById(R.id.connectButton);

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(ForgotPassword.this, MainActivity.class);
            ForgotPassword.this.startActivity(myIntent);
        });


        sendEmail.setOnClickListener(v -> {
            Snackbar snackBar = Snackbar .make(v, "Le Email a été envoyé!", Snackbar.LENGTH_LONG);
            snackBar.show();
        });

        connect.setOnClickListener(v -> {
           // Intent myIntent = new Intent(ForgotPassword.this, searchFriends.class);
            //ForgotPassword.this.startActivity(myIntent);
        });


        connectButton = findViewById(R.id.connectButton);
        connectButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(ForgotPassword.this, User.class);
            ForgotPassword.this.startActivity(myIntent);
        });
    }
}