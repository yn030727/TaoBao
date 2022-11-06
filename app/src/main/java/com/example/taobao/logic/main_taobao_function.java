package com.example.taobao.logic;

import android.provider.ContactsContract;

public class main_taobao_function {
    int Imageid;
    String ImageName;
    public main_taobao_function(int Imageid,String ImageName){
        this.Imageid=Imageid;
        this.ImageName=ImageName;
    }
    public int getImageid() {
        return Imageid;
    }

    public String getImageName() {
        return ImageName;
    }
}
