package com.example.myapplication1;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Checkboxactivity extends AppCompatActivity implements View.OnClickListener {
CheckBox c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkboxactivity);
       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
         //   return insets;
       // });

        c1=findViewById(R.id.check1);
        c2=findViewById(R.id.check2);
        c3=findViewById(R.id.check3);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
    }
    public void onClick(View v){
        if(c1.isChecked())
            Toast.makeText(this,"java is clicked",Toast.LENGTH_LONG).show();
        if(c2.isChecked())
            Toast.makeText(this,"kotlin is clicked",Toast.LENGTH_LONG).show();
        if(c3.isChecked())
            Toast.makeText(this,"c# is clicked",Toast.LENGTH_LONG).show();

    }
}