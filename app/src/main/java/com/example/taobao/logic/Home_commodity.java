package com.example.taobao.logic;

public class Home_commodity {
    int imageID;
    String text1;
    String price;

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public int getImageID() {
        return imageID;
    }

    public String getPrice() {
        return price;
    }

    public String getText1() {
        return text1;
    }
    public Home_commodity(int imageID,String text1,String price){
        this.imageID=imageID;
        this.text1=text1;
        this.price=price;
    }
}
