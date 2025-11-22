package com.example.myapplication1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Compoundlab32 extends AppCompatActivity {

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compoundlab32);
        res = findViewById(R.id.resultView);

        double p = getIntent().getDoubleExtra("p", 0);
        double r = getIntent().getDoubleExtra("r", 0);
        double t = getIntent().getDoubleExtra("t", 0);

        // Simple Interest
        double si = (p * r * t) / 100;

        // Compound Interest
        double ci = p * Math.pow((1 + r / 100), t) - p;

        res.setText(
                "Simple Interest: " + String.format("%.2f", si) +
                        "\nCompound Interest: " + String.format("%.2f", ci)
        );
    }
}