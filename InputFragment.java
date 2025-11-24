package com.example.myapplication1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/*public class InputFragment extends Fragment {

        EditText cp, sp;
        Button calculateBtn;

        DataPassListener dataPassListener;

        public interface DataPassListener {
            void onDataPass(String result);
        }

        @Override
        public void onAttach(Context context) {
            super.onAttach(context);
            dataPassListener = (DataPassListener) context;
        }

        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_input, container, false);

            cp = view.findViewById(R.id.cp);
            sp = view.findViewById(R.id.sp);
            calculateBtn = view.findViewById(R.id.btnCalc);

            calculateBtn.setOnClickListener(v -> {
                double c = Double.parseDouble(cp.getText().toString());
                double s = Double.parseDouble(sp.getText().toString());

                double percent = ((s - c) / c) * 100;

                String res;
                if (percent > 0)
                    res = "Profit: " + percent + "%";
                else if (percent < 0)
                    res = "Loss: " + Math.abs(percent) + "%";
                else
                    res = "No Profit No Loss";

                dataPassListener.onDataPass(res);
            });

            return view;
        }
    }*/
//Q3:
public class InputFragment extends Fragment {

    EditText len, wid, hei;
    Button calcBtn;
    DataPassListener dataPassListener;

    public interface DataPassListener {
        void onDataPass(String result);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        dataPassListener = (DataPassListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_input, container, false);

        len = view.findViewById(R.id.len);
        wid = view.findViewById(R.id.wid);
        hei = view.findViewById(R.id.hei);
        calcBtn = view.findViewById(R.id.btnCalc);

        calcBtn.setOnClickListener(v -> {
            double l = Double.parseDouble(len.getText().toString());
            double w = Double.parseDouble(wid.getText().toString());
            double h = Double.parseDouble(hei.getText().toString());

            double area = 2 * (l*w + w*h + l*h);
            double volume = l * w * h;

            String result = "Area: " + area + "\nVolume: " + volume;
            dataPassListener.onDataPass(result);
        });

        return view;
    }
}


