package com.example.taobao.logic;

public class main_message {
    int imageId;
    String main_message;
    String second_message;
    String data_message;
    public main_message(int imageId,String main_message,String second_message,String data_message){
        this.imageId=imageId;
        this.main_message=main_message;
        this.second_message=second_message;
        this.data_message=data_message;
    }

    public int getImageId() {
        return imageId;
    }

    public String getData_message() {
        return data_message;
    }

    public String getMain_message() {
        return main_message;
    }

    public String getSecond_message() {
        return second_message;
    }
}
