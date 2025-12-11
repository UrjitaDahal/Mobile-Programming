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

public class LogoGridAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] name;
    int[] img;

    public LogoGridAdapter(Activity context, String[] name, int[] img) {
        super(context, R.layout.logogridview, name);
        this.context = context;
        this.name = name;
        this.img = img;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.logogridview, null, true);

        ImageView uimg = v.findViewById(R.id.logo);
        TextView uname = v.findViewById(R.id.lname);

        uimg.setImageResource(img[position]);
        uname.setText(name[position]);

        return v;
    }
}
