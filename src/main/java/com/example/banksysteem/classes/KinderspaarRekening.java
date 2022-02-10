package com.example.banksysteem.classes;

public class KinderspaarRekening extends Rekening{
    public KinderspaarRekening(String rekeningNr, double teGoed) {
        super(rekeningNr, teGoed);
    }

    public String toString(){return "KinderspaarRekening";}
}
