package com.ABriukhachev;

public class Produkt {
    private String nazevProduktu;
    private String produkt;
    private double cena;

    public Produkt(String nazevProduktu, String produkt, double cena){
        this.nazevProduktu = nazevProduktu;
        this.produkt = produkt;
        this.cena = cena;
    }
    @Override
    public String toString(){
        return nazevProduktu;
    }
    public String getNazevProduktu() {
        return nazevProduktu;
    }
    public Double getCena() {
        return cena;
    }
}
