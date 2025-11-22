package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class radioboxactivity extends AppCompatActivity {


    RadioButton r1, r2;
    Spinner sp;
    Button b1;
    TextView txtres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radioboxactivity);


        r1 = findViewById(R.id.rad1);
        r2 = findViewById(R.id.rad2);
        sp= findViewById(R.id.spin1);
        b1= findViewById(R.id.radbut1);
        txtres= findViewById(R.id.resview1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="Gender:";
                if(r1.isChecked())
                    result += "Male \n";
                else if (r2.isChecked())
                    result +="Female \n";

                String program = sp.getSelectedItem().toString();
                result += "program : "+program;
                txtres.setText(result);


            }
        });
    }
}
