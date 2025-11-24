package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

//q1 output:

/* public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();


                ft.add(R.id.fragmentContainer, new FragmentA());
                ft.commit();
            }
        }*/

//q2 output:
/*public class MainActivity extends AppCompatActivity
        implements InputFragment.DataPassListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Only Input Fragment should be visible first
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, new InputFragment())
                .commit();
    }

    @Override
    public void onDataPass(String result) {

        // Create OutputFragment only when needed
        OutputFragment outputFragment = new OutputFragment();

        Bundle bundle = new Bundle();
        bundle.putString("result", result);
        outputFragment.setArguments(bundle);

        // Now show Output Fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container2, outputFragment)
                .commit();
    }
}*/
public class MainActivity extends AppCompatActivity
        implements InputFragment.DataPassListener {

    OutputFragment outputFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputFragment = new OutputFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, new InputFragment())
                .replace(R.id.container2, outputFragment)
                .commit();
    }

    @Override
    public void onDataPass(String result) {
        outputFragment.updateResult(result);
    }
}





