package com.example.bai3_buoi4;

public class Data {
    int img1;
    int img2;
    int img3;
    int img4;
    int img5;
    String text;

    public Data(int img1,int img2,int img3,int img4,int img5, String text)
    {
        this.img1=img1;
        this.img2=img2;
        this.img3=img3;
        this.img4=img4;
        this.img5=img5;
        this.text=text;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg2(int img2) {
        this.img2 = img2;
    }

    public int getImg2() {
        return img2;
    }

    public void setImg3(int img3) {
        this.img3 = img3;
    }

    public int getImg3() {
        return img3;
    }

    public void setImg4(int img4) {
        this.img4 = img4;
    }

    public int getImg4() {
        return img4;
    }

    public void setImg5(int img5) {
        this.img5 = img5;
    }

    public int getImg5() {
        return img5;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
