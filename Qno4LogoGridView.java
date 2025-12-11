package com.example.labreport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Qno4LogoGridView extends AppCompatActivity {

    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_qno4_logo_grid_view);
        grid = findViewById(R.id.appGrid);

        int[] logos = {
                R.drawable.discord, R.drawable.instagram, R.drawable.twitter,
                R.drawable.youtube
        };

        String[] names = {
                "discord","instagram","twitter","YouTube"
        };

        String[] links = {
                "https://discord.com","https://www.instagram.com","https://x.com",
                "https://www.youtube.com"

        };

        LogoGridAdapter adapter = new LogoGridAdapter(this, names, logos);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener((parent, view, position, id) -> {

            Intent i = new Intent(Qno4LogoGridView.this, Qno4LogoSecondactivity.class);
            i.putExtra("sitename", names[position]);
            i.putExtra("url", links[position]);
            startActivity(i);
        });
    }
}

