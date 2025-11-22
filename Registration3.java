package com.example.myapplication1;


import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.Spinner;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registration3 extends AppCompatActivity {

    RadioButton r1, r2;
    CheckBox c1, c2, c3;
    Spinner s1;
    Button b1;
    TextView txtres;
    EditText ename, eaddress, eemail, epassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registration3);

        // EditTexts
        ename = findViewById(R.id.ename);
        eaddress = findViewById(R.id.eaddress);
        eemail = findViewById(R.id.eemail);
        epassword = findViewById(R.id.epassword);

        // CheckBoxes
        c1 = findViewById(R.id.check1);
        c2 = findViewById(R.id.check2);
        c3 = findViewById(R.id.check3);

        // RadioButtons
        r1 = findViewById(R.id.male);
        r2 = findViewById(R.id.female);

        // Spinner
        s1 = findViewById(R.id.spin);

        // Button and Result Text
        b1 = findViewById(R.id.btnsubmit);
        txtres = findViewById(R.id.result);

        // Button Click Listener
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();

                // Name, Address, Username
                result.append("Name: ").append(ename.getText().toString()).append("\n");
                result.append("Address: ").append(eaddress.getText().toString()).append("\n");
                result.append("Email: ").append(eemail.getText().toString()).append("\n");

                // Gender
                result.append("Gender: ");
                if (r1.isChecked())
                    result.append("Male\n");
                else if (r2.isChecked())
                    result.append("Female\n");
                else
                    result.append("Not Selected\n");

                // Department (CheckBoxes)
                result.append("Hobbies: ");
                String dept = "";
                if (c1.isChecked()) dept += "Singing ";
                if (c2.isChecked()) dept += "Dancing ";
                if (c3.isChecked()) dept += "reading ";
                if (dept.isEmpty()) dept = "None";
                result.append(dept).append("\n");

                // Program (Spinner)
                String program = s1.getSelectedItem().toString();
                result.append("Country: ").append(program).append("\n");

                // Password (Optional to display)
                 result.append("Password: ").append(epassword.getText().toString()).append("\n");

                // Set Result
                txtres.setText(result.toString());
            }
        });
    }


}


