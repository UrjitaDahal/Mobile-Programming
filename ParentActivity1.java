package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ParentActivity1 extends AppCompatActivity {
    EditText l, b;
    Button b1;
    TextView txtchild;
    static final int REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_parent1);

        l = findViewById(R.id.length1);
        b = findViewById(R.id.breadth1);
        b1 = findViewById(R.id.calculatebtn);
        txtchild = findViewById(R.id.resultchild);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int len = Integer.parseInt(l.getText().toString());
                int bd = Integer.parseInt(b.getText().toString());

                Intent i = new Intent(getApplicationContext(), ChildActivity1.class);
                i.putExtra("length", len);
                i.putExtra("breadth", bd);
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            String result = data.getStringExtra("result");
            txtchild.setText(result);
        }
    }
}
