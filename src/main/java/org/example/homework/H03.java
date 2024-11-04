package org.example.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        dreieck(10);
    }

    private static void skonto() {
        LocalDate rechnunsdatum = LocalDate.of(2024, 11, 1);
        LocalDate zahlungseingangSkonto4 = LocalDate.of(2024, 11, 14);
        LocalDate zahlungseingangSkonto2 = LocalDate.of(2024, 11, 27);
        LocalDate zahlungseingangSkonto0 = LocalDate.of(2024, 12, 14);
        double rechnungsbetrag = 100;
        System.out.println("Zahlugseingang: " + zahlungseingangSkonto4.format(DateTimeFormatter.ofPattern("dd-MM-yy")) + ": 4 % Skonto " + rechnungsbetrag + " wird zu " + berechnungSkonto(rechnunsdatum, zahlungseingangSkonto4, rechnungsbetrag));
        System.out.println("Zahlugseingang: " + zahlungseingangSkonto2.format(DateTimeFormatter.ofPattern("dd-MM-yy")) + ": 2 % Skonto " + rechnungsbetrag + " wird zu " + berechnungSkonto(rechnunsdatum, zahlungseingangSkonto2, rechnungsbetrag));
        System.out.println("Zahlugseingang: " + zahlungseingangSkonto0.format(DateTimeFormatter.ofPattern("dd-MM-yy")) + ": 0 % Skonto " + rechnungsbetrag + " wird zu " + berechnungSkonto(rechnunsdatum, zahlungseingangSkonto0, rechnungsbetrag));
    }

    private static double berechnungSkonto(LocalDate rechnungsdatum, LocalDate zahlungseingang, double betrag) {
        if (rechnungsdatum.datesUntil(zahlungseingang).count() <= 14) {
            return (betrag / 100) * 96;
        } else if (rechnungsdatum.datesUntil(zahlungseingang).count() <= 28) {
            return (betrag / 100) * 98;
        } else {
            return betrag;
        }
    }

    public static void fakeBlackJack() {
        int countPlayer = 0;
        int countAi = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int userInput = -1;
            while (userInput < 0 || userInput > 16) {
                System.out.println("Bitte eine Zahl 1 - 16. 0 zum abbrechen");
                userInput = sc.nextInt();
            }
            countPlayer += userInput;
            countAi += random.nextInt(1, 17);
            System.out.println("Spieler Punktzahl: " + countPlayer);
            System.out.println("Computer Punktzahl: " + countAi);
            if (userInput == 0 || countPlayer > 50 || countAi > 50) {
                break;
            }
        }
        if (countAi > 50) {
            System.out.println("Gewonnen");
        } else {
            System.out.println("Verloren");
        }
    }

    public static void dreieck(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
