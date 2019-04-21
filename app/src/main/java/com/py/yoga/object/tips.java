package com.py.yoga.object;

public class tips {

   private int id;
  private String title;
  private int image;
  String Desc;

    public tips(int id, String title, String desc, int image) {
        this.id = id;
        this.title = title;
        this.Desc = desc;
        this.image = image;
    }

    public String getDesc() {
        return Desc;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }



    public int getImage() {
        return image;
    }
}
