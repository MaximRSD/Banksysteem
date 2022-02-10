package com.example.banksysteem.classes;

public class Rekening {


    private double teGoed;

    public String getRekeningNr() {
        return rekeningNr;
    }
    private String rekeningNr;


    public Rekening(String rekeningNr, double teGoed ){
        this.teGoed = teGoed;
        this.rekeningNr = rekeningNr;
    }

    public void neemop(double bedrag){
        teGoed = teGoed - bedrag;
    }

    public void stort(double bedrag){
        teGoed = teGoed + bedrag;
    }
}
