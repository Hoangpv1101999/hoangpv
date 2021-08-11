/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Import {
    private int orderid;
    private float payment;
    private Date date;
    private int gid;
    
    

    public Import() {
    }

    public Import(int orderid, float payment, Date date, int gid) {
        this.orderid = orderid;
        this.payment = payment;
        this.date = date;
        this.gid = gid;
    }

    
    

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Override
    public String toString() {
        return "Import{" + "orderid=" + orderid + ", payment=" + payment + ", date=" + date + ", gid=" + gid + '}';
    }

    
    
    
}
