package com.example.labreport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FruitGridAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] name;
    int[] img;

    public FruitGridAdapter(Activity context, String[] name, int[] img) {
        super(context, R.layout.gridviewitem, name);
        this.context = context;
        this.name = name;
        this.img = img;
    }

    @Override
    public int getCount() {
        return name.length;   // Only this one is needed
    }

    @NonNull

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            v = inflater.inflate(R.layout.gridviewitem, parent, false);
        }
        ImageView uimg = v.findViewById(R.id.fruit);
        TextView uname = v.findViewById(R.id.name);

        uimg.setImageResource(img[position]);
        uname.setText(name[position]);

        return v;
    }

}