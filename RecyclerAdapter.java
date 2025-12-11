package com.example.labreport;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    int[] id;
    String[] name;
    String[] address;
    int[] salary;
    int[] img;


    Activity context;

    public RecyclerAdapter(Activity context, int[] id,String[] name, String[] address, int[] salary,int[] img  ){
        this.context=context;
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary=salary;
        this.img=img;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rowv = inflater.inflate(R.layout.recycleritem, parent, false);
        return new ViewHolder(rowv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.uid.setText(String.valueOf(id[position]));
        holder.uname.setText(name[position]);
        holder.uadd.setText(address[position]);
        holder.usalary.setText(String.valueOf(salary[position]));
        holder.img.setImageResource(img[position]);


    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView  uid,uname, uadd,  usalary;
        ImageView img;

        public ViewHolder(View viewitem) {
            super(viewitem);
            uid = viewitem.findViewById(R.id.txtuid);
            uname = viewitem.findViewById(R.id.txtuname);
            uadd = viewitem.findViewById(R.id.txtuadd);
            usalary = viewitem.findViewById(R.id.txtsalary);
            img = viewitem.findViewById(R.id.person);
        }
    }
}
