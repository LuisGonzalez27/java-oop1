package org.lessons.java.shop;

import java.util.Random;
import java.text.DecimalFormat;

import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class Prodotto {
    private final int codice;
    private final String nome;
    private final String descrizione;
    private final double prezzo;
    private final double iva;

    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = generateRandomCode();
    }
    public String getNome() {
        return nome;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public double getPrezzoIva() {
        double prezzoIva = prezzo + (prezzo * iva / 100);
        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        return Double.parseDouble(df.format(prezzoIva));
    }
    public int getCodice() {
        return codice;
    }
    public String getNomeEsteso() {
        return codice + "-" + nome;
    }
    private int generateRandomCode() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
}
