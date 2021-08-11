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
public class Product {

    private int id;
    private String name;
    private int amountOfBunch;
    private int amountProinBunch;
    private String img;
    private String producer;
    private String supplier;
    private int orderid;
    private int total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfBunch() {
        return amountOfBunch;
    }

    public void setAmountOfBunch(int amountOfBunch) {
        this.amountOfBunch = amountOfBunch;
    }

    public int getAmountProinBunch() {
        return amountProinBunch;
    }

    public void setAmountProinBunch(int amountProinBunch) {
        this.amountProinBunch = amountProinBunch;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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

    public Product(int id, String name, int amountOfBunch, int amountProinBunch, String img, String producer, String supplier, int orderid, int total) {
        this.id = id;
        this.name = name;
        this.amountOfBunch = amountOfBunch;
        this.amountProinBunch = amountProinBunch;
        this.img = img;
        this.producer = producer;
        this.supplier = supplier;
        this.orderid = orderid;
        this.total = total;
    }

    public Product() {
    }

}
