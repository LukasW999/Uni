package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bmi();
    }
    public static void bmi(){
        Scanner sc = new Scanner(System.in);
        double gewicht = 0;
        double groesse = 0;
        long bmi = 0;
        System.out.println("Bitte geben sie ihr Gewicht an");
        gewicht = sc.nextDouble();
        System.out.println("Bitte geben sie ihre Größe an");
        groesse = sc.nextDouble();
        bmi = Math.round(gewicht/(groesse*groesse));
        while (bmi < 25) {
            if (bmi > 25){
                System.out.println("Sie sind zu dick");
                System.out.println("Wollen sie groesser werden oder ");
            }

        };
        System.out.println("Glückwunsch, jetzt leben sie gesund");

    }
}