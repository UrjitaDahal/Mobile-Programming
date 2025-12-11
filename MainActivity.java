package com.example.labreport;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    /*no 1:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listView;
        String subjects[] = {
                "C Programming", "Digital Logic", "Networking",
                "Operating System", "Statistics",
                "Java Programming", "DBMS", "Web Technology",
                "Software Engineering", "MIS & E-Business"
        };
            listView = findViewById(R.id.listView);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(
                    this, android.R.layout.simple_list_item_1, subjects);

            listView.setAdapter(adapter);
        }
    }*/



    /*no 2:
    ListView listView;

    String names[] = {"Ram", "Sita", "Gita", "Hari", "Bina"};
    String rolls[] = {"1", "2", "3", "4", "5"};
    String address[] = {"Kathmandu", "Lalitpur", "Bhaktapur", "Butwal", "Pokhara"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter adapter = new ArrayAdapter(
                this, android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, i, id) -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Student Details");


            String message = "Name: " + names[i] + "\n"
                    + "Roll: " + rolls[i] + "\n"
                    + "Address: " + address[i];
            builder.setMessage(message);


            builder.setPositiveButton("OK", (dialog, which) -> {
                dialog.dismiss();
            });

            builder.show();
        });


    }
}*/

    //no 4:



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qno4_logo_grid_view);


    }
}

