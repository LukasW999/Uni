package org.example.homework.H04_And_5;

import org.example.homework.H04_And_5.schiff.berufsschiffahrt.deutschland.Containerschiff;

public class Main {
    public static void main(String[] args) {

        Containerschiff deutschland =
                new Containerschiff("Inland", 1000, 900, 3333);

        org.example.homework.H04_And_5.schiff.berufsschiffahrt.ausland.Containerschiff ausland =
                new org.example.homework.H04_And_5.schiff.berufsschiffahrt.ausland.Containerschiff
                        ("Ausland", 1500, 500, 1);

        System.out.println(deutschland);
        System.out.println(ausland);
    }
}
