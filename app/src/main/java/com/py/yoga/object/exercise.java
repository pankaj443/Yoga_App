package com.py.yoga.object;

import android.os.Parcelable;

public class exercise {

    int id;
    String title;
    int imageView;
    String desc;


    public exercise(int id, String title, int imageView, String desc) {
        this.id = id;
        this.title = title;
        this.imageView = imageView;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
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
