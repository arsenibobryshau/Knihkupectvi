
package com.mycompany.knihkupectvimain;


public class Kniha {
    private String název;
    private String autor;
    private int početStran;
    private String žánr;
    private int hmotnost;

    public Kniha(String název, String autor, int početStran, String žánr, int hmotnost) {
        this.název = název;
        this.autor = autor;
        this.početStran = početStran;
        this.žánr = žánr;
        this.hmotnost = hmotnost;
    }

    public String getNázev() {
        return název;
    }

    public String getAutor() {
        return autor;
    }

    public int getPočetStran() {
        return početStran;
    }

    public String getŽánr() {
        return žánr;
    }

    public int getHmotnost() {
        return hmotnost;
    }

    @Override
    public String toString() {
        return String.format("Kniha: %s, Autor: %s, Počet stran: %d, Žánr: %s, Hmotnost: %d g",
                název, autor, početStran, žánr, hmotnost);
    }
}

