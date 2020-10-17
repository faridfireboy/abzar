package com.example.abzar;

public class item {
    private String img_call;
    private String txt_name;
    private String txt_code;

    public String getImg_call() {
        return img_call;
    }

    public void setImg_call(String img_call) {
        this.img_call = img_call;
    }

    public String getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(String txt_name) {
        this.txt_name = txt_name;
    }

    public String getTxt_code() {
        return txt_code;
    }

    public void setTxt_code(String txt_code) {
        this.txt_code = txt_code;
    }

    public item(String img_call, String txt_name, String txt_code) {
        this.img_call = img_call;
        this.txt_name = txt_name;
        this.txt_code = txt_code;
    }
}
