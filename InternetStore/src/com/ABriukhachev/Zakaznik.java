package com.ABriukhachev;

import java.lang.constant.Constable;

public class Zakaznik {
    private int cisloZakazky;
    private String jmeno;
    private String prijmeni;

    public Zakaznik(int cisloZakazky, String jmeno, String prijmeni){
        this.cisloZakazky = cisloZakazky;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
    }
    @Override
    public String toString(){
        return String.format("%s %s", jmeno, prijmeni);
    }
    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
}
