package org.example.homework;

import java.util.Scanner;

public class H05_2 {

    public static void main(String[] args) {
        gennauuu();
    }

    private static void fuelCalculator() {
        System.out.println("Liter");
        Scanner sc = new Scanner(System.in);
        double litre = sc.nextDouble();
        System.out.println("Preis");
        double price = sc.nextDouble();
        System.out.println("Gesamtbetrag: " + price * litre);
        System.out.println("Gesamtbetrag: " + (price * litre) / 119 * 100);
    }

    private static void pyramid() {
        long laenge = 440;
        long heihgt = 280;
        System.out.println("Volumen(Ellen): " + volumePyramid(laenge, heihgt));
        System.out.println("Volumen(m): " + volumePyramid(ellenToM(laenge), ellenToM(heihgt)));
        System.out.println("Volumen(Schellen): " + volumePyramid(ellenToScheffeln(laenge), ellenToScheffeln(heihgt)));
        System.out.println("Benötigt Steine: " + volumePyramid(laenge, heihgt) / 2);
    }

    private static double volumePyramid(double laenge, double height) {
        return ((laenge * laenge) * height) / 3;
    }

    private static double ellenToM(long elle) {
        return elle * 52.4 * 100;
    }

    private static double ellenToScheffeln(long elle) {
        return ellenToM(elle) / 1000 * 25.93;
    }

    private static void schock(int n) {
        int dutzend = 0;
        int schock = 0;
        int gros = 0;
        int stueck = n;
        int counter = 0;
        while (stueck > 12) {
            if (counter == 12) {
                counter = 0;
                stueck = stueck - 12;
                dutzend++;
            }
            if (dutzend == 12) {
                dutzend = 0;
                gros++;
            }
            System.out.println(counter);
            counter++;
        }
        while (dutzend > 4) {
            dutzend = dutzend - 5;
            schock++;
        }
        System.out.println("Stueck: " + stueck);
        System.out.println("Dutzend: " + dutzend);
        System.out.println("Schock: " + schock);
        System.out.println("gros: " + gros);
    }

    private static void zeichenZahlenUmwandlung(){
        System.out.println((char) 65);
        System.out.println((char) 193);
        int l = 'L';
        int w = 'W';
        System.out.println("L: "+ l);
        System.out.println("W: "+ w);
        int lCopy = l;
        StringBuilder builder = new StringBuilder();
        while (lCopy > 0) {
            builder.append(lCopy % 2);
            lCopy = lCopy / 2;
        }
        System.out.println(builder.reverse());
        int wCopy = w;
        StringBuilder builder2 = new StringBuilder();
        while (wCopy > 0) {
            builder2.append(wCopy % 2);
            wCopy = wCopy / 2;
        }
        System.out.println(builder2.reverse());
        String lBinaer=Integer.toBinaryString(l);
        String wBinaer=Integer.toBinaryString(w);
        System.out.println(lBinaer);
        System.out.println(wBinaer);
        System.out.println((char) Integer.parseInt(lBinaer,2));
        System.out.println((char) Integer.parseInt(wBinaer,2));
    }

    private static void gennauuu(){
        float flow = 10 * 0.111f;
        System.out.printf("&.12f", flow);
        //Zeigt ne komische error Message an
    }
}
