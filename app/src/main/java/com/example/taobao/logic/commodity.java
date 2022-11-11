package com.example.taobao.logic;

public class commodity {
    //店铺图片和名字
    int dianpuImage;
    String dianpuName;
    //商品信息
    int commdityImage;
    String commdityName;
    String commdityDescription;
    String price;
    public commodity(int dianpuImage,String dianpuName,int commdityImage,String commdityName,String commdityDescription,String price){
        this.commdityDescription=commdityDescription;
        this.commdityImage=commdityImage;
        this.commdityName=commdityName;
        this.dianpuImage=dianpuImage;
        this.dianpuName=dianpuName;
        this.price=price;
    }

    public int getCommdityImage() {
        return commdityImage;
    }

    public int getDianpuImage() {
        return dianpuImage;
    }

    public String getPrice() {
        return price;
    }

    public String getCommdityDescription() {
        return commdityDescription;
    }

    public String getCommdityName() {
        return commdityName;
    }

    public String getDianpuName() {
        return dianpuName;
    }
}
