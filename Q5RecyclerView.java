package com.example.labreport;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Q5RecyclerView extends AppCompatActivity {


    RecyclerView rview;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_q5_recycler_view);
            rview=findViewById(R.id.recycleview);
            int[] id={101,102,103,104,105};

            String[] name={"Hari","Ram","Sita","Rite","Geeta"};
            String[] address={"Kathmandu","Bhaktapur","Lalitpur","Pokhara","Banepa"};
            int[] salary={10000,20000,30000,40000,500000};

            int[] img={R.drawable.twitter,R.drawable.twitter,R.drawable.twitter,R.drawable.twitter,R.drawable.twitter};

            LinearLayoutManager layoutManager=new LinearLayoutManager(this);
            rview.setLayoutManager(layoutManager);

//        GridLayoutManager layoutManager1=new GridLayoutManager(this,2);
//        rview.setLayoutManager(layoutManager1);

            RecyclerAdapter adapter=new RecyclerAdapter(this,id,name,address,salary,img);
            rview.setAdapter(adapter);


        }
    }
