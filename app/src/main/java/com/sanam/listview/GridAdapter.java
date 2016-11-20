package com.sanam.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sanam on 11/19/16.
 */

public class GridAdapter extends BaseAdapter {

    String[] title;
    int[] image;
    LayoutInflater inflater;
    Context context;

    ViewHolder vh;

    public GridAdapter(Context c, String[] t, int[] img) {
        this.context = c;
        this.title = t;
        this.image = img;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_row, null);
            vh = new ViewHolder();
            vh.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            vh.textTitle = (TextView) convertView.findViewById(R.id.tvTitle);

            convertView.setTag(vh);
        } else {

            vh = (ViewHolder) convertView.getTag();
        }

        vh.imageView.setImageResource(image[position]);
        vh.textTitle.setText(title[position]);


        return convertView;
    }

    public static class ViewHolder {
        public ImageView imageView;
        public TextView textTitle;
    }
}
