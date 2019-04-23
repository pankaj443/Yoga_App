package com.py.yoga.object;

import android.graphics.drawable.Drawable;

public class workout
{
    private int id,imageID;
    Drawable wallpaper;
    String exercises,duration,description,totalexe;


    public workout(int id,int imageID,String exercises,String duration,String description,String totalexe,Drawable wallpaper)
    {
        this.id=id;
        this.imageID=imageID;
        this.exercises=exercises;
        this.description=description;
        this.duration=duration;
        this.totalexe=totalexe;
        this.wallpaper = wallpaper;

    }

    public Drawable getWallpaper() {
        return wallpaper;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDuration() {
        return duration;
    }

    public String getExercises() {
        return exercises;
    }

    public int getImageID() {
        return imageID;
    }

    public String getTotalexe() {
        return totalexe;
    }
}
