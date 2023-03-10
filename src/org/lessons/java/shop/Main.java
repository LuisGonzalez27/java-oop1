package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto("Smartphone", "Smartphone con cuffie wireless ", 299.99, 22);
        System.out.println("Codice: " + prodotto.getCodice());
        System.out.println("Nome: " + prodotto.getNome());
        System.out.println("Descrizione: " + prodotto.getDescrizione());
        System.out.println("Prezzo base: " + prodotto.getPrezzo());
        System.out.println("Prezzo con IVA: " + prodotto.getPrezzoIva());
        System.out.println("Nome esteso: " + prodotto.getNomeEsteso());
    }
}
