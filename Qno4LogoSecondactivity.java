package com.example.labreport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Qno4LogoSecondactivity extends AppCompatActivity {
    TextView siteName, siteUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_qno4_logo_secondactivity);

        siteName = findViewById(R.id.siteName);
        siteUrl = findViewById(R.id.siteUrl);

        String name = getIntent().getStringExtra("sitename");
        final String url = getIntent().getStringExtra("url");

        siteName.setText("Website: " + name);
        siteUrl.setText("Link: " + url);

        // Make the TextView clickable
        siteUrl.setOnClickListener(v -> {
            // Open URL in browser
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });
    }
}


