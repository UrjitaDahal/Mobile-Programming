package com.example.lab7database;



import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.*;
import com.android.volley.toolbox.*;

import org.json.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class MainActivity extends AppCompatActivity {
    EditText etName, etPhone;
    TextView tvDisplay;

    String url = "http://10.0.2.2/EncodeJson/api.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // etName = findViewById(R.id.etName);
        //etPhone = findViewById(R.id.etPhone);
        tvDisplay = findViewById(R.id.tvDisplay);

        // Task 2: Store record in remote server
       // findViewById(R.id.btnSave).setOnClickListener(v -> saveDataToServer());

        // Task 3: Retrieval of contents from remote server
        findViewById(R.id.btnFetch).setOnClickListener(v -> fetchData());
    }

    // Task 2 Logic: Send Data (POST)
   /* private void saveDataToServer() {
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                response -> Toast.makeText(MainActivity.this, "Server Says: " + response, Toast.LENGTH_SHORT).show(),
                error -> Log.e("VOLLEY_ERROR", error.toString())) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("name", name);
                params.put("phone", phone);
                return params;
            }
        };
        Volley.newRequestQueue(this).add(stringRequest);
    }
}*/
      // Task 3 Logic: Retrieve and Format Data (GET)
      void fetchData() {
          JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null,
                  response -> {
                      tvDisplay.setText(""); // Clear previous text
                      try {
                          for (int i = 0; i < response.length(); i++) {
                              JSONObject obj = response.getJSONObject(i);
                              String name = obj.getString("name");
                              String phone = obj.getString("phone");

                              // Format the display nicely
                              tvDisplay.append("Name: " + name + "\nPhone: " + phone + "\n\n");
                          }
                      } catch (JSONException e) {
                          e.printStackTrace();
                      }
                  },
                  err -> tvDisplay.setText("Error fetching data: " + err.toString()));
          Volley.newRequestQueue(this).add(request);
      }}

   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ... your existing code for etName, etPhone, etc.

        // ADD THIS FOR TASK 4:
        Button btnOpenMap = findViewById(R.id.btnOpenMap);
        btnOpenMap.setOnClickListener(v -> {
            // Intent moves the user from MainActivity to MapsActivity
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });
    }
}*/
/*
// number 1 :
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DBHelper db;
    EditText eid, name, address, salary;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DBHelper(this);
        eid = findViewById(R.id.eid);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        salary = findViewById(R.id.salary);
        resultText = findViewById(R.id.resultText);

        Button insert = findViewById(R.id.insert);
        Button update = findViewById(R.id.update);
        Button delete = findViewById(R.id.delete);
        Button view = findViewById(R.id.view);

        insert.setOnClickListener(v -> {
            boolean res = db.insertEmployee(
                    Integer.parseInt(eid.getText().toString()),
                    name.getText().toString(),
                    address.getText().toString(),
                    Double.parseDouble(salary.getText().toString())
            );
            resultText.setText(res ? "Inserted Successfully" : "Insert Failed");
        });

        update.setOnClickListener(v -> {
            boolean res = db.updateEmployee(
                    Integer.parseInt(eid.getText().toString()),
                    name.getText().toString(),
                    address.getText().toString(),
                    Double.parseDouble(salary.getText().toString())
            );
            resultText.setText(res ? "Updated Successfully" : "Update Failed");
        });

        delete.setOnClickListener(v -> {
            boolean res = db.deleteEmployee(Integer.parseInt(eid.getText().toString()));
            resultText.setText(res ? "Deleted Successfully" : "Delete Failed");
        });

        view.setOnClickListener(v -> {
            Cursor cursor = db.getAllEmployees();
            if (cursor.getCount() == 0) {
                resultText.setText("No Data Found");
                cursor.close();
                return;
            }
            StringBuilder sb = new StringBuilder();
            while (cursor.moveToNext()) {
                sb.append("ID: ").append(cursor.getInt(0)).append("\n");
                sb.append("Name: ").append(cursor.getString(1)).append("\n");
                sb.append("Address: ").append(cursor.getString(2)).append("\n");
                sb.append("Salary: ").append(cursor.getDouble(3)).append("\n\n");
            }
            resultText.setText(sb.toString());
            cursor.close();
        });
    }
}*/
