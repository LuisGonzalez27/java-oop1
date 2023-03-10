package org.lessons.java.bank;


import java.util.Scanner;
import java.util.Random;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String nomeUtente;
        int scelta;
        double importo;

        System.out.print("Inserisci il tuo nome: ");
        nomeUtente = scanner.nextLine();

        Conto conto = new Conto(random.nextInt(1000) + 1, nomeUtente);
        System.out.println(conto.getInfoConto());

        do {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1 - Versare una somma di denaro");
            System.out.println("2 - Prelevare una somma di denaro");
            System.out.println("3 - Uscire");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1 -> {
                    System.out.print("Quanto vuoi versare? ");
                    importo = scanner.nextDouble();
                    conto.versa(importo);
                    System.out.println(conto.getSaldoFormattato());
                }
                case 2 -> {
                    System.out.print("Quanto vuoi prelevare? ");
                    importo = scanner.nextDouble();
                    if (conto.preleva(importo)) {
                        System.out.println(conto.getSaldoFormattato());
                    } else {
                        System.out.println("Operazione non valida: saldo insufficiente!");
                    }
                }
                case 3 -> System.out.println("Grazie per aver usato il nostro servizio.");
                default -> System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 3);
    }
}
