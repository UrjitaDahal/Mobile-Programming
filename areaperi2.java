package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class areaperi2 extends AppCompatActivity  {

    EditText length, breadth;
    Button btnArea, btnPerimeter;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaperi2);

        length = findViewById(R.id.length);
        breadth = findViewById(R.id.breadth);
        btnArea = findViewById(R.id.btnArea);
        btnPerimeter = findViewById(R.id.btnPerimeter);
        result = findViewById(R.id.txtResult);

        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (length.getText().toString().isEmpty() || breadth.getText().toString().isEmpty()) {
                    result.setText("Please enter both length and breadth!");
                    return;
                }

                double l = Double.parseDouble(length.getText().toString());
                double b = Double.parseDouble(breadth.getText().toString());
                double area = l * b;

                result.setText("Area of Rectangle: " + area);
            }
        });

        btnPerimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (length.getText().toString().isEmpty() || breadth.getText().toString().isEmpty()) {
                    result.setText("Please enter both length and breadth!");
                    return;
                }

                double l = Double.parseDouble(length.getText().toString());
                double b = Double.parseDouble(breadth.getText().toString());
                double perimeter = 2 * (l + b);

                result.setText("Perimeter of Rectangle: " + perimeter);
            }
        });
    }
}
