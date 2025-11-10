package org.example.klausurvorbereitung.Eins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Funktion wo der Benutzer einen Dateinamen angibt,
 * wenn der Falsch ist, wird er aufgefordert einen neuen zu machen und
 * wenn er irgendwann mal richtig ist dann wir der Inhalt der Datei ausgeben.
 */
public class Drei {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean falsch = true;
        while (falsch) {
            try {
                System.out.print("Dateiname bitte");
                File f = new File(scanner.next());
                if (!f.canRead()){
                    throw new FileNotFoundException();
                }
            } catch (Exception e) {
                System.out.print("Bitte korrekte eingabe");
            }
        }
    }
}
