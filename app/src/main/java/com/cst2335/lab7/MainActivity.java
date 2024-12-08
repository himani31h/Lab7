package com.cst2335.lab7;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button in the layout
        Button btnGoToToolbar = findViewById(R.id.btnGoToToolbar);

        // Set an OnClickListener to navigate to TestToolbar activity
        btnGoToToolbar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TestToolbar.class);
            startActivity(intent);
        });
    }
}
