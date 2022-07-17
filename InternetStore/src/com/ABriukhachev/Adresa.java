package com.ABriukhachev;

public class Adresa {
    private String ulice;
    private int cisloPopisne;
    private int cisloOrientacne;
    private String mesto;
    private String psc;

    public Adresa (String ulice, int cisloPopisne, int cisloOrientacne, String mesto, String psc){
        this. ulice = ulice;
        this.cisloPopisne = cisloPopisne;
        this.cisloOrientacne = cisloOrientacne;
        this.mesto = mesto;
        this.psc = psc;
    }
    @Override
    public String toString(){
        return String.format("%s %d %d/%d %s %s", ulice, cisloPopisne, cisloOrientacne, mesto, psc);
    }
    public String getUlice() {
        return ulice;
    }
    public int getCisloPopisne() {
        return cisloPopisne;
    }
    public int getCisloOrientacni() {
        return cisloOrientacne;
    }
    public String getMesto() {
        return mesto;
    }
    public String getPsc() {
        return psc;
    }

}
