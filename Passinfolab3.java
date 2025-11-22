package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Passinfolab3 extends AppCompatActivity {
    EditText name, address;
    RadioGroup genderGroup;
    CheckBox hobby1, hobby2;
    Spinner program;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_passinfolab3);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        genderGroup = findViewById(R.id.genderGroup);
        hobby1 = findViewById(R.id.hobby1);
        hobby2 = findViewById(R.id.hobby2);
        program = findViewById(R.id.programSpinner);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uname = name.getText().toString();
                String uaddress = address.getText().toString();

                int selected = genderGroup.getCheckedRadioButtonId();
                RadioButton rb = findViewById(selected);
                String gender = rb.getText().toString();

                String hobbies = "";
                if (hobby1.isChecked()) hobbies += "Reading ";
                if (hobby2.isChecked()) hobbies += "Traveling ";

                String prog = program.getSelectedItem().toString();

                Intent i = new Intent(Passinfolab3.this, Passinfolab32.class);

                i.putExtra("name", uname);
                i.putExtra("address", uaddress);
                i.putExtra("gender", gender);
                i.putExtra("hobbies", hobbies);
                i.putExtra("program", prog);

                startActivity(i);
            }
        });
    }
    }
