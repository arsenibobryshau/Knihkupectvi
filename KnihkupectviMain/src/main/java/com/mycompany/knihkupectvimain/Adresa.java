
package com.mycompany.knihkupectvimain;


public class Adresa {
    private String jméno;
    private String uliceČíslo;
    private String město;
    private String PSČ;

    public Adresa(String jméno, String uliceČíslo, String město, String PSČ) {
        this.jméno = jméno;
        this.uliceČíslo = uliceČíslo;
        this.město = město;
        this.PSČ = PSČ;
    }

    @Override
    public String toString() {
        return String.format("Adresa: %s, Ulice/Číslo: %s, Město: %s, PSČ: %s",
                jméno, uliceČíslo, město, PSČ);
    }
}
