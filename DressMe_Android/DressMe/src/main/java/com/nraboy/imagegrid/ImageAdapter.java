package com.nraboy.imagegrid;

import check.test.R;
import android.content.Context;
import android.widget.BaseAdapter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.view.ViewGroup;

///Displays certain size of list depending on the size of stored photos
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private GridView gridView = null;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    /// create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            /// if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    /// references to our images
    private Integer[] mThumbIds = {
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.screen1, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201,
            R.drawable.rsz_add201, R.drawable.rsz_add201
    };
}