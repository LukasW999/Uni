package org.example.homework;

import java.util.Scanner;

public class H05_2 {

    public static void main(String[] args) {
        schock(370);
    }
    public static void fuelCalculator(){
        System.out.println("Liter");
        Scanner sc = new Scanner(System.in);
        double litre = sc.nextDouble();
        System.out.println("Preis");
        double price = sc.nextDouble();
        System.out.println("Gesamtbetrag: " + price*litre);
        System.out.println("Gesamtbetrag: " + (price*litre)/100*81);
    }
    public static void pyramid(){
        int laenge=440;
        int heihgt=280;
        System.out.println("Volumen(Ellen): "+ volumePyramid(laenge,heihgt));
        System.out.println("Volumen(m): "+ volumePyramid(ellenToM(laenge),ellenToM(heihgt)));
        System.out.println("Volumen(Schellen): "+ volumePyramid(ellenToScheffeln(laenge),ellenToScheffeln(heihgt)));
        System.out.println("Benötigt Steine: " + volumePyramid(laenge,heihgt)/2);
    }
    public static double volumePyramid(double laenge, double height){
        return ((laenge*laenge)*height)/3;
    }
    public static double ellenToM(int elle){
        return elle*52.4*100;
    }
    public static double ellenToScheffeln(int elle){
        return ellenToM(elle)/1000*25.93;
    }
    public static void schock(int n){
        int dutzend = 0;
        int schock = 0;
        int gros = 0;
        int stueck=0;
        for (int i = 0; i < n; i++) {
            if (i%12==0){
                dutzend++;
            }
            if (dutzend==12){
                dutzend=0;
                gros++;
            }
        }
        System.out.println("Dutzend: " + dutzend);
        System.out.println("Schock: " + schock);
        System.out.println("gros: "+ gros);
        
    }
}
