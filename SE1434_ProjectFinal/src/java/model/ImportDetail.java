/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class ImportDetail {
    private int orderid;
    private String name;
    private int amount;
    private String note;
    private String dvt;
    private String khsx;

    public ImportDetail() {
    }

    public ImportDetail(int orderid, String name, int amount, String note, String dvt, String khsx) {
        this.orderid = orderid;
        this.name = name;
        this.amount = amount;
        this.note = note;
        this.dvt = dvt;
        this.khsx = khsx;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getKhsx() {
        return khsx;
    }

    public void setKhsx(String khsx) {
        this.khsx = khsx;
    }

    @Override
    public String toString() {
        return "ImportDetail{" + "orderid=" + orderid + ", name=" + name + ", amount=" + amount + ", note=" + note + ", dvt=" + dvt + ", khsx=" + khsx + '}';
    }

    
    
    
}
