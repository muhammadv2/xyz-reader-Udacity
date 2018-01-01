package com.example.xyzreader.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

class ImageLoaderHelper {

    public static void setImageOnImageView(Context applicationContext, String url, ImageView imageView) {
        Picasso.with(applicationContext)
                .load(url)
                .into(imageView);
    }
}
