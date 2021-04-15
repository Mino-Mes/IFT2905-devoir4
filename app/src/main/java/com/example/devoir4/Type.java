package com.example.devoir4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class Type extends AppCompatActivity {

    private Button nextButton;
    private Button doc;
    private Button movie;
    private Button series;

    private int buttonCounter1;
    private int buttonCounter2;
    private int buttonCounter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);

        nextButton = findViewById(R.id.nextButton);
        doc= findViewById(R.id.documentary);
        series =findViewById(R.id.series);
        movie= findViewById(R.id.movie);

        nextButton.setOnClickListener(v->{
            Intent myIntent = new Intent(Type.this, Search.class);
            Type.this.startActivity(myIntent);
        });

        buttonCounter1 =1;
        buttonCounter2 =1;
        buttonCounter3 =1;

        doc.setOnClickListener(v -> {
            buttonCounter1 += 1;

            if(buttonCounter1 % 2 ==0)
            {
                doc.setBackgroundColor(getColor(R.color.doc));
                doc.setTextColor(Color.WHITE);
            }
            else {
                doc.setBackgroundColor(Color.WHITE);
                doc.setTextColor(Color.BLACK);
            }
        });

        series.setOnClickListener(v -> {
            buttonCounter2 += 1;

            if(buttonCounter2 % 2 ==0)
            {
                series.setBackgroundColor(getColor(R.color.series));
                series.setTextColor(Color.WHITE);
            }
            else {
                series.setBackgroundColor(Color.WHITE);
                series.setTextColor(Color.BLACK);
            }
        });

        movie.setOnClickListener(v -> {
            buttonCounter3 += 1;

            if(buttonCounter3 % 2 ==0)
            {
                movie.setBackgroundColor(getColor(R.color.movie));
                movie.setTextColor(Color.WHITE);
            }
            else {
                movie.setBackgroundColor(Color.WHITE);
                movie.setTextColor(Color.BLACK);
            }
        });
    }
}