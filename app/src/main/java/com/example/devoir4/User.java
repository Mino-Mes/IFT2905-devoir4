package com.example.devoir4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class User extends AppCompatActivity {

    private Button user1;
    private Button user2;
    private Button user3;
    private Button user4;
    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        user1= findViewById(R.id.user1);
        user2= findViewById(R.id.user2);
        user3= findViewById(R.id.user3);
        user4= findViewById(R.id.user4);
        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(User.this, MainActivity.class);
            User.this.startActivity(myIntent);
        });

        user1.setOnClickListener(v -> {
            Intent myIntent = new Intent(User.this, Type.class);
            User.this.startActivity(myIntent);
        });

        user2.setOnClickListener(v -> {
            Intent myIntent = new Intent(User.this, Type.class);
            User.this.startActivity(myIntent);
        });

        user3.setOnClickListener(v -> {
            Intent myIntent = new Intent(User.this, Type.class);
            User.this.startActivity(myIntent);
        });


        user4.setOnClickListener(v -> {
            Intent myIntent = new Intent(User.this, Type.class);
            User.this.startActivity(myIntent);
        });
    }
}