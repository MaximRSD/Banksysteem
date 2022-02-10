package com.example.banksysteem.classes;

public class BetaalRekening extends Rekening {
    public BetaalRekening(String rekeningNr, double teGoed) {
        super( rekeningNr, teGoed);
    }

    public String toString(){return "BetaalRekening()";}
}


