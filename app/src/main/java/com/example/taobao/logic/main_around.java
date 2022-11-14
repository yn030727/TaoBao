package com.example.taobao.logic;

public class main_around {
    int around_image;
    String around_message;
    int around_head_portrait;
    String around_user;
    public main_around(int image,String message,int portrait,String user){
        this.around_image=image;
        this.around_head_portrait=portrait;
        this.around_message=message;
        this.around_user=user;
    }

    public int getAround_head_portrait() {
        return around_head_portrait;
    }

    public int getAround_image() {
        return around_image;
    }

    public String getAround_message() {
        return around_message;
    }

    public String getAround_user() {
        return around_user;
    }
}
