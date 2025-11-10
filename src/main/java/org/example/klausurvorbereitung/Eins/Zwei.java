package org.example.klausurvorbereitung.Eins;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Zwei {
    public static void main(String[] args) throws InterruptedException {
        b();
    }
    /**
     * A: Checked: InterruptedException, Unchecked: NullPointerException
     */

    private static void b() throws InterruptedException {
        Thread.sleep(60);
        String a = null;
        a.getBytes();
    }

    /**
     * C) Daran das eine von RuntimeException erbt und das andere nicht. Und das die IDE die checked exception anzeigt die runtime normalerweise aber nicht.
     */
}
