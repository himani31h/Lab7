package com.cst2335.lab7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class TestToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_toolbar);

        // Set up the Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set up the Navigation Drawer
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_gallery: // Correct reference to nav_gallery
                    Toast.makeText(this, "Navigating to Gallery", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(TestToolbar.this, GalleryActivity.class));
                    return true;

                case R.id.nav_maps: // Correct reference to nav_maps
                    Toast.makeText(this, "Navigating to Maps", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(TestToolbar.this, MapsActivity.class));
                    return true;

                case R.id.nav_exit: // Correct reference to nav_exit
                    Toast.makeText(this, "Exiting to Login", Toast.LENGTH_SHORT).show();
                    finish();
                    return true;

                default:
                    return false;
            }
        });
    }
}
