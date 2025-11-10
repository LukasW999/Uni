package org.example;

import org.example.marten.Fahrzeug;
import org.example.marten.Pflegecreme;
import org.example.marten.Punkt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Füge deine Subreddit-Namen ein (jeweils eine Zeile). Beende mit einer Leerzeile:");

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            System.out.println("https://www.reddit.com/r/" + line);
        }

        scanner.close();
        System.out.println("Fertig.");
    }



    public static void doWhileTest() {
        int x = 10; // 0
        int result = 1; // 11
        do {
            if (x % 3 == 0) {
                result *= 2;
            } else {
                result += x / 4; // 2 / 4 =0,5 11 + 0,5 = 11
            }
            x -= 2; // 2 - 2 = 0
        } while (x > 0);
        System.out.println(result);
    }


}