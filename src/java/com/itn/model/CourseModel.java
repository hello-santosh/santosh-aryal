/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.model;

public class CourseModel {
    
    private int cid;
    private String title;
    private int price;
    private String duration;
    
    public CourseModel(int cid,String title,int price,String duration) {
        this.cid = cid;
        this.title = title;
        this.price = price;
        this.duration = duration;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }
    
}
