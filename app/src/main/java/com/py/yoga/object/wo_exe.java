package com.py.yoga.object;

public class wo_exe
{
    private int imageID;
    private String name;
    int imageView;
    String desc;

    public wo_exe(int imageID, String name, int imageView, String desc) {
        this.imageID = imageID;
        this.name = name;
        this.imageView = imageView;
        this.desc = desc;
    }

    public int getImageView() {
        return imageView;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageID() {
        return imageID;
    }

    public String getName() {
        return name;
    }
}
