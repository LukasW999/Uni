package org.example.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class H03 {
    public static void main(String[] args) {
        skonto();
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

    public static void FakeBlackJack() {
        int countPlayer = 0;
        int countAij = 0;


    }
}
