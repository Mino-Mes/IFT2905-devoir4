package com.example.devoir4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView forgotPasswordButton;
    private Button signUpButton;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forgotPasswordButton = findViewById(R.id.forgotLabel);
        forgotPasswordButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, ForgotPassword.class);
            MainActivity.this.startActivity(myIntent);
        });

        connectButton = findViewById(R.id.connectButton);
        connectButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, User.class);
            MainActivity.this.startActivity(myIntent);
        });

        signUpButton =  findViewById(R.id.createAccountButton);
        signUpButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, SignUp.class);
            MainActivity.this.startActivity(myIntent);
        });

    }
}