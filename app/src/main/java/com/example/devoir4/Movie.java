package com.example.devoir4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class Movie extends AppCompatActivity {

    private TextView backButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        getSupportActionBar().hide();

        backButton =  findViewById(R.id.backButton);
        button = findViewById(R.id.activateButton);

        button.setOnClickListener(v -> {
            Snackbar snackBar = Snackbar .make(v, "Nos serveurs de visonnement de ne fonctionne pas pour le moment", Snackbar.LENGTH_LONG);
            snackBar.show();
        });

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(Movie.this, Search.class);
            startActivity(myIntent);
            finish();
        });

    }
}