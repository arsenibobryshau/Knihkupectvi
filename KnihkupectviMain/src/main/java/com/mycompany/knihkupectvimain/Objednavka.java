
package com.mycompany.knihkupectvimain;


public class Objednavka {
    private Kniha[] knihy;
    private Adresa adresa;
    private int pocetKnih;

    public Objednavka(int kapacita) {
        this.knihy = new Kniha[kapacita];
        this.pocetKnih = 0;
    }

    public void přidejKnihu(Kniha kniha) {
        if (pocetKnih < knihy.length) {
            knihy[pocetKnih] = kniha;
            pocetKnih++;
        } else {
            System.out.println("Objednávka je plná, nelze přidat další knihu.");
        }
    }

    public void vypišObjednávku() {
        System.out.println(adresa);
        System.out.println("Seznam knih:");
        for (int i = 0; i < pocetKnih; i++) {
            System.out.println(knihy[i]);
        }
    }

    public void vypišKnihyOdAutora(String autor) {
        System.out.println("Knihy od autora " + autor + ":");
        for (int i = 0; i < pocetKnih; i++) {
            if (knihy[i].getAutor().equals(autor)) {
                System.out.println(knihy[i]);
            }
        }
    }

    public void vypišKnihyPodleŽánruDelšíNež(String žánr, int početStránek) {
        System.out.println("Knihy žánru " + žánr + " delší než " + početStránek + " stran:");
        for (int i = 0; i < pocetKnih; i++) {
            if (knihy[i].getŽánr().equals(žánr) && knihy[i].getPočetStran() > početStránek) {
                System.out.println(knihy[i]);
            }
        }
    }

    public double celkováHmotnost() {
        double celkováHmotnost = 0;
        for (int i = 0; i < pocetKnih; i++) {
            celkováHmotnost += knihy[i].getHmotnost();
        }
        return celkováHmotnost;
    }

    public int početBalíků(int maxHmotnostBalíku) {
        int početBalíků = 0;
        double aktuálníHmotnost = 0;

        for (int i = 0; i < pocetKnih; i++) {
            aktuálníHmotnost += knihy[i].getHmotnost();

            if (aktuálníHmotnost > maxHmotnostBalíku) {
                početBalíků++;
                aktuálníHmotnost = knihy[i].getHmotnost();
            }
        }

        if (aktuálníHmotnost > 0) {
            početBalíků++;
        }

        return početBalíků;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}
