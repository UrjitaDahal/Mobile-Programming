package com.example.myapplication1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DialogFactorialActivity2 extends AppCompatActivity {
    //question 2 lab 5:
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dialog_factorial2);
        btn=findViewById(R.id.btnfact);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder= new AlertDialog.Builder(DialogFactorialActivity2.this);
                builder.setTitle("Factorial or Cube ");
                builder.setMessage("Enter a number here ");
                builder.setCancelable(true);
                EditText et=new EditText(getApplicationContext());

                builder.setView(et);

                builder.setPositiveButton("Factorial", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        int num = Integer.parseInt(et.getText().toString());
                        int f = 1;
                        for (int k = 1; k <= num; k++)
                            f = f * k;
                        Toast.makeText(getApplicationContext(), "Factorial "+f, Toast.LENGTH_LONG).show();
                    }

                });
                 builder.setNegativeButton("Cube", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int q) {

                            int x=1;
                            int cube=Integer.parseInt(et.getText().toString());
                             x=cube*cube*cube;
                         Toast.makeText(getApplicationContext(), "Cube "+x, Toast.LENGTH_LONG).show();
                     }
                 });
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });
    }
    }
