package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity1 extends AppCompatActivity {
    TextView txtdata;
    Button calc;
    int l, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_child1);

        txtdata = findViewById(R.id.parentdata);
        calc = findViewById(R.id.childcalc1);

        Intent i = getIntent();
        l = i.getIntExtra("length", 0);
        b = i.getIntExtra("breadth", 0);

        txtdata.setText("Length = " + l + "\nBreadth = " + b);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int area = l * b;
                int peri = 2 * (l + b);

                String result = "\nArea = " + area + "\nPerimeter = " + peri;


                Intent returnIntent = new Intent();
                returnIntent.putExtra("result", result);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
