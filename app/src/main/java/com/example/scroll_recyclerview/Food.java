package com.example.scroll_recyclerview;

public class Food {

    public static final int TYPE_CAFE = 1;
    public static final int TYPE_TRASUA = 2;
    public static final int TYPE_SUACHUA = 3;
    private int image ;
    private String name;
    private int type;

    public Food(String name, int image, int type) {
        this.name = name;
        this.image = image;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
