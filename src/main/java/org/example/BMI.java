package org.example;

import java.util.Scanner;

public class BMI {
    private double gewicht = -1;
    private double groesse = -1;

    private double berechnen() {
        if (this.gewicht == -1) {
            return -1;
        }
        if (this.groesse == -1) {
            return -1;
        }
        return Math.pow(this.gewicht / (this.groesse * this.groesse), 1);
    }

    public void einlesen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ihr Gewicht an");
        setGewicht(sc.nextDouble());
        System.out.println("Bitte geben sie ihre Größe an");
        setGroesse(sc.nextDouble());
        System.out.println("Vielen Dank fÜr ihre Eingabe");
    }

    public void ausgeben() {
        double bmi = berechnen();
        if (bmi == -1 || this.groesse == -1 || this.gewicht == -1) {
            System.out.println("FEHLER");
            System.out.println("Bitte geben sie vorher beide Werte Korrekt an");
            return;
        }
        System.out.println("Ihr Gewicht ist: " + getGewicht());
        System.out.println("Ihre Grösse ist: " + getGroesse());
        System.out.println("Ihr BMI ist: " + bmi);
    }

    private void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    private void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    private double getGroesse() {
        return groesse;
    }

    private double getGewicht() {
        return gewicht;
    }
}
