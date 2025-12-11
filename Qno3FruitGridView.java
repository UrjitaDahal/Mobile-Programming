package com.example.labreport;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Qno3FruitGridView extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_qno3_fruit_grid_view);

        grid = findViewById(R.id.gridView);

        int[] img = {
                R.drawable.apple, R.drawable.mango, R.drawable.grape,
                R.drawable.guava, R.drawable.orange, R.drawable.watermelon,
                R.drawable.strawberry, R.drawable.banana, R.drawable.pineapple,
                R.drawable.papaya
        };

        String[] name = {
                "Apple", "Mango", "Grape", "Guava", "Orange",
                "Watermelon", "Strawberry", "Banana", "Pineapple", "Papaya"
        };

        FruitGridAdapter adapter = new FruitGridAdapter(Qno3FruitGridView.this, name, img);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener((adapterView, view, position, id) -> {
            Toast.makeText(
                    Qno3FruitGridView.this,
                    "Clicked item is " + name[position],
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
