/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Export {
    private int stt;
    private int productId;
    private int lowQuality;
    private int qualified;
    private Date date;
    private String note;
    private int orderid;
    private int total;
    private float rateall;
    private int proFinish;
    private float ratelow;
    private float ratequalified;

    public Export() {
    }

    public Export(int stt, int productId, int lowQuality, int qualified, Date date, String note, int orderid, int total, float rateall, int proFinish, float ratelow, float ratequalified) {
        this.stt = stt;
        this.productId = productId;
        this.lowQuality = lowQuality;
        this.qualified = qualified;
        this.date = date;
        this.note = note;
        this.orderid = orderid;
        this.total = total;
        this.rateall = rateall;
        this.proFinish = proFinish;
        this.ratelow = ratelow;
        this.ratequalified = ratequalified;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getLowQuality() {
        return lowQuality;
    }

    public void setLowQuality(int lowQuality) {
        this.lowQuality = lowQuality;
    }

    public int getQualified() {
        return qualified;
    }

    public void setQualified(int qualified) {
        this.qualified = qualified;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getRateall() {
        return rateall;
    }

    public void setRateall(float rateall) {
        this.rateall = rateall;
    }

    public int getProFinish() {
        return proFinish;
    }

    public void setProFinish(int proFinish) {
        this.proFinish = proFinish;
    }

    public float getRatelow() {
        return ratelow;
    }

    public void setRatelow(float ratelow) {
        this.ratelow = ratelow;
    }

    public float getRatequalified() {
        return ratequalified;
    }

    public void setRatequalified(float ratequalified) {
        this.ratequalified = ratequalified;
    }

    
    

    

    
   
    
}
