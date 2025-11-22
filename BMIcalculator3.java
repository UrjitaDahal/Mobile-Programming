package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
import androidx.core.view.*;

public class BMIcalculator3 extends AppCompatActivity {

    EditText w, h;
    Button calc;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator3);

        w = findViewById(R.id.weight);
        h = findViewById(R.id.height);
        calc = findViewById(R.id.calcBMI);
        result = findViewById(R.id.result);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight = Double.parseDouble(w.getText().toString());
                double height = Double.parseDouble(h.getText().toString());

                double bmi = weight / (height * height);
                String status;

                if (bmi < 18.5) status = "Underweight";
                else if (bmi <= 24.9) status = "Healthy Weight";
                else if (bmi <= 29.9) status = "Overweight";
                else status = "Obesity";

                result.setText("BMI: " + String.format("%.2f", bmi) + "\nStatus: " + status);
            }
        });
    }
}