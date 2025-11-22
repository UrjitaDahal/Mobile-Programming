package com.example.myapplication1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Passinfolab32 extends AppCompatActivity {
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passinfolab32);
        display = findViewById(R.id.display);

        String data =
                "Name: " + getIntent().getStringExtra("name") + "\n" +
                        "Address: " + getIntent().getStringExtra("address") + "\n" +
                        "Gender: " + getIntent().getStringExtra("gender") + "\n" +
                        "Hobbies: " + getIntent().getStringExtra("hobbies") + "\n" +
                        "Program: " + getIntent().getStringExtra("program");

        display.setText(data);
    }
}