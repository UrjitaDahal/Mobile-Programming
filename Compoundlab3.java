package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Compoundlab3 extends AppCompatActivity {
    EditText p, r, t;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_compoundlab3);
        p = findViewById(R.id.principal);
        r = findViewById(R.id.rate);
        t = findViewById(R.id.time1);
        send = findViewById(R.id.sendBtn);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(p.getText().toString().isEmpty() ||
                        r.getText().toString().isEmpty() ||
                        t.getText().toString().isEmpty()) {

                    Toast.makeText(Compoundlab3.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                double principal = Double.parseDouble(p.getText().toString());
                double rate = Double.parseDouble(r.getText().toString());
                double time = Double.parseDouble(t.getText().toString());

                Intent i = new Intent(Compoundlab3.this, Compoundlab32.class);
                i.putExtra("p", principal);
                i.putExtra("r", rate);
                i.putExtra("t", time);

                startActivity(i);
            }
        });
    }
    }

