package com.py.yoga.object;

public class adrine {
    String id;
    String title;
    private int image;

    public String getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public adrine(String id, String title, int image) {
        this.id = id;
        this.title = title;
        this.image = image;
    }
}
