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
public class ProductPayment {
    private int id;
    private float payment;

    public ProductPayment() {
    }

    public ProductPayment(int id, float payment) {
        this.id = id;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "ProductPayment{" + "id=" + id + ", payment=" + payment + '}';
    }
    
    
}
