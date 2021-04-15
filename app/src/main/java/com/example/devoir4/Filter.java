package com.example.devoir4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.devoir4.ui.home.HomeFragment;
import com.google.android.material.snackbar.Snackbar;

public class Filter extends AppCompatActivity {

    private Spinner typeSpinner;
    private Spinner genreSpinner;
    private Spinner resolutionSpinner;
    private TextView backButton;
    private Button activateButton;
    private Button resetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        getSupportActionBar().hide();

        typeSpinner = findViewById(R.id.typeSpinner);
        genreSpinner = findViewById(R.id.genreSpinner);
        resolutionSpinner = findViewById(R.id.resolutionSpinner);
        backButton =  findViewById(R.id.backButton);
        activateButton = findViewById(R.id.activateButton);
        resetButton = findViewById(R.id.resetButton);


        activateButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(Filter.this, Search.class);
            myIntent.putExtra("message1", "Vos gouts ont etait mis a jour !");
            startActivity(myIntent);
            finish();
        });

        resetButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(Filter.this, Search.class);
            myIntent.putExtra("message2", "Vos gouts ont etait reinistialiser");
            startActivity(myIntent);
            finish();
        });

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(Filter.this, Search.class);
            startActivity(myIntent);
            finish();
        });

        String [] types = {"Film", "Series", "Documentaire"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, types);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        typeSpinner.setAdapter(adapter);

        String [] genres = {"Action", "Amour", "Drama", "Policier", "International", "Mystere", "Thriller"};
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, genres);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genreSpinner.setAdapter(adapter2);

        String [] resolutions = {"720p", "1080p", "1440p", "4k"};
        ArrayAdapter adapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, resolutions);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        resolutionSpinner.setAdapter(adapter3);
    }
}