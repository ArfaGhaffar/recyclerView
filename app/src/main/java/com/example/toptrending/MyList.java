package com.example.toptrending;

public class MyList {

    private String description;
    private int imgId;
    private  String subtitle;
    public MyList(String description, int imgId,String subtitle) {
        this.description = description;
        this.imgId = imgId;
        this.subtitle=subtitle;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}



