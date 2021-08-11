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
public class ExportDetail {

    private int stt;
    private String typeError;
    private String rateAllow;
    private String rateNotAllow;
    private int amountError;
    private float rate;
    private String note;
    private int proid;

    public ExportDetail() {
    }

    public ExportDetail(int stt, String typeError, String rateAllow, String rateNotAllow, int amountError, float rate, String note, int proid) {
        this.stt = stt;
        this.typeError = typeError;
        this.rateAllow = rateAllow;
        this.rateNotAllow = rateNotAllow;
        this.amountError = amountError;
        this.rate = rate;
        this.note = note;
        this.proid = proid;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTypeError() {
        return typeError;
    }

    public void setTypeError(String typeError) {
        this.typeError = typeError;
    }

    public String getRateAllow() {
        return rateAllow;
    }

    public void setRateAllow(String rateAllow) {
        this.rateAllow = rateAllow;
    }

    public String getRateNotAllow() {
        return rateNotAllow;
    }

    public void setRateNotAllow(String rateNotAllow) {
        this.rateNotAllow = rateNotAllow;
    }

    public int getAmountError() {
        return amountError;
    }

    public void setAmountError(int amountError) {
        this.amountError = amountError;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

   

    

    
}
