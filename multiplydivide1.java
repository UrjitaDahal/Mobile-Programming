package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class multiplydivide1 extends AppCompatActivity {

    EditText n1, n2;
    Button bmul, bdiv;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplydivide1);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        bmul = findViewById(R.id.btnMul);
        bdiv = findViewById(R.id.btnDiv);
        result = findViewById(R.id.result1);

        // Multiplication button
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numStr1 = n1.getText().toString();
                String numStr2 = n2.getText().toString();

                if (numStr1.isEmpty() || numStr2.isEmpty()) {
                    result.setText("Please enter both numbers!");
                    return;
                }

                double num1 = Double.parseDouble(numStr1);
                double num2 = Double.parseDouble(numStr2);
                double mul = num1 * num2;

                result.setText("Multiplication Result: " + mul);
            }
        });

        // Division button
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numStr1 = n1.getText().toString();
                String numStr2 = n2.getText().toString();

                if (numStr1.isEmpty() || numStr2.isEmpty()) {
                    result.setText("Please enter both numbers!");
                    return;
                }

                double num1 = Double.parseDouble(numStr1);
                double num2 = Double.parseDouble(numStr2);

                if (num2 == 0) {
                    result.setText("Cannot divide by zero!");
                } else {
                    double div = num1 / num2;
                    result.setText("Division Result: " + String.format("%.2f", div));
                }
            }
        });
    }
}
