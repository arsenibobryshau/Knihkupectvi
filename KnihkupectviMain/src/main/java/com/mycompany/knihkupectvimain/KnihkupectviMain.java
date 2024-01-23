
package com.mycompany.knihkupectvimain;


public class KnihkupectviMain {

    public static void main(String[] args) {
        // Vytvoření několika knih
        Kniha kniha1 = new Kniha("Kniha 1", "Autor 1", 200, "Fantasy", 500);
        Kniha kniha2 = new Kniha("Kniha 2", "Autor 2", 300, "Sci-fi", 700);
        Kniha kniha3 = new Kniha("Kniha 3", "Autor 1", 150, "Drama", 400);

        // Vytvoření instance třídy Adresa
        Adresa adresa = new Adresa("Jan Novák", "Hlavní 10", "Praha", "110");
    }
}
