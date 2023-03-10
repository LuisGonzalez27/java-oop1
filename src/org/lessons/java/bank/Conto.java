package org.lessons.java.bank;

import java.text.NumberFormat;
public class Conto {
    private final int numeroConto;
    private final String nomeProprietario;
    private double saldo;

    public Conto(int numeroConto, String nomeProprietario) {
        this.numeroConto = numeroConto;
        this.nomeProprietario = nomeProprietario;
        this.saldo = 0.0;
    }
    public void versa(double importo) {
        saldo += importo;
    }

    public boolean preleva(double importo) {
        if (saldo - importo < 0) {
            return false;
        }
        saldo -= importo;
        return true;
    }

    public String getInfoConto() {
        return "Conto n. " + numeroConto + ", Proprietario: " + nomeProprietario;
    }

    public String getSaldoFormattato() {
        NumberFormat formatoValuta = NumberFormat.getCurrencyInstance();
        return "Saldo: " + formatoValuta.format(saldo);
    }
}