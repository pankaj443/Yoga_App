package com.py.yoga.object;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class exercise {

    int id;
    String title;
    int imageView;




    public exercise(int id, String title, int imageView) {
        this.id = id;
        this.title = title;
        this.imageView = imageView;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getImageView() {
        return imageView;
    }


}
