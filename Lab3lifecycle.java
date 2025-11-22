package com.example.myapplication1;

import android.os.Bundle;
import android.util.Log;
//import android.widget.TextView;
import android.widget.*;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lab3lifecycle extends AppCompatActivity {
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab3lifecycle);

        tvStatus = findViewById(R.id.stat);
        show("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        show("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        show("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        show("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        show("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        show("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        show("onDestroy");
    }

    private void show(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.d("LIFECYCLE", msg);
        tvStatus.append(msg + "\n");
    }
    }
