package org.example;

public class Main {
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.einlesen();
        bmi.ausgeben();
    }

    public static void iterationWhile(int randomNumber) {
        int divider = 10;
        while (randomNumber > 1) {
            if (randomNumber % divider == 0) {
                System.out.println(divider);
                randomNumber = randomNumber / divider;
            } else {
                divider++;
            }
        }
    }

    public static void iterationDoWhile() {
        int randomNumber = 80;
        int divider = 2;
        do {
            if (randomNumber % divider == 0) {
                System.out.println(divider);
                randomNumber = randomNumber / divider;
            } else {
                divider++;
            }
        } while (randomNumber > 1);
    }
}