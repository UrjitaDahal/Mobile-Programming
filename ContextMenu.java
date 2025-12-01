package com.example.myapplication1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;

public class ContextMenu extends AppCompatActivity {

    Button btnContext, btnPopup;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_context_menu);


        btnContext = findViewById(R.id.btncon);
        btnPopup = findViewById(R.id.btnpopup);
        layout = findViewById(R.id.main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Register Context Menu for button
        registerForContextMenu(btnContext);

        // Popup Menu on button click
        btnPopup.setOnClickListener(view -> {
            PopupMenu popup = new PopupMenu(ContextMenu.this, btnPopup);
            popup.inflate(R.menu.popupmenu);

            popup.setOnMenuItemClickListener(item -> {
                if (item.getItemId() == R.id.editcopy)
                    Toast.makeText(this, "Copy selected", Toast.LENGTH_SHORT).show();
                else if (item.getItemId() == R.id.editcut)
                    Toast.makeText(this, "Cut selected", Toast.LENGTH_SHORT).show();
                else if (item.getItemId() == R.id.editpaste)
                    Toast.makeText(this, "Paste selected", Toast.LENGTH_SHORT).show();
                return true;
            });

            popup.show();
        });
    }


    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v,
                                    android.view.ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.contextmenu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.red)
            layout.setBackgroundColor(Color.RED);
        else if (item.getItemId() == R.id.blue)
            layout.setBackgroundColor(Color.BLUE);
        else if (item.getItemId() == R.id.green)
            layout.setBackgroundColor(Color.GREEN);
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionsmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.opt_about) {
            Toast.makeText(this, "About clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.opt_settings) {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
