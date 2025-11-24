package com.example.myapplication1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//Q2:
/*public class OutputFragment extends Fragment {

    TextView resultText;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_output, container, false);
        resultText = view.findViewById(R.id.resultText);

        if (getArguments() != null) {
            String data = getArguments().getString("result");
            resultText.setText(data);
        }

        return view;
    }
}
*/

//Q3:
public class OutputFragment extends Fragment {

    TextView resultText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_output, container, false);
        resultText = view.findViewById(R.id.resultText);
        return view;
    }

    public void updateResult(String result) {
        resultText.setText(result);
    }
}
