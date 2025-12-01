package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


//q3 simple interest custom dialog :

/*public class MainActivity extends AppCompatActivity {

    Button btnOpenDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_dialog);

                EditText etP = dialog.findViewById(R.id.etPrincipal);
                EditText etT = dialog.findViewById(R.id.etTime);
                EditText etR = dialog.findViewById(R.id.etRate);
                Button btnCal = dialog.findViewById(R.id.btnCalculate);
                TextView txtResult = dialog.findViewById(R.id.txtResult);

                btnCal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            double p = Double.parseDouble(etP.getText().toString());
                            double t = Double.parseDouble(etT.getText().toString());
                            double r = Double.parseDouble(etR.getText().toString());

                            double si = (p * t * r) / 100;

                            txtResult.setText("Simple Interest = " + si);
                        } catch (NumberFormatException e) {
                            Toast.makeText(MainActivity.this,
                                    "Please enter valid numbers",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                dialog.show();
            }
        });
    }
}*/

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);
    }
}

