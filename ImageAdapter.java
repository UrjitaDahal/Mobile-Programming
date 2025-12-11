package com.example.labreport;



import android.content.Context;
import android.view.*;
import android.widget.*;

public class ImageAdapter extends BaseAdapter {

    Context context;
    int images[];

    public ImageAdapter(Context c, int img[]) {
        context = c;
        images = img;
    }

    @Override
    public int getCount() { return images.length; }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img = new ImageView(context);
        img.setImageResource(images[position]);
        img.setLayoutParams(new GridView.LayoutParams(250, 250));
        img.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return img;
    }
}
