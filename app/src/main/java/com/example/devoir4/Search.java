package com.example.devoir4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Search extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra("message1");
        String message2 = intent.getStringExtra("message2");

        if(message1 !=null)
        {
            Snackbar snackBar = Snackbar.make(findViewById(R.id.drawer_layout), message1, Snackbar.LENGTH_LONG);
            snackBar.show();
        }
        else if(message2 !=null)
        {
            Snackbar snackBar = Snackbar.make(findViewById(R.id.drawer_layout),message2 , Snackbar.LENGTH_LONG);
            snackBar.show();
        }


    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void imageClick(View view) {

        Intent myIntent = new Intent(this, Movie.class);
        startActivity(myIntent);
    }

    public void ChangeUser(MenuItem item) {
        Intent myIntent = new Intent(this, User.class);
        startActivity(myIntent);
    }

    public void Disconnect(MenuItem item) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}