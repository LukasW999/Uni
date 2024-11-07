package org.example.homework.H04;

import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Containerschiff c = new Containerschiff
                ("DerGido", 1000, 900, 3333);
        System.out.println(c.getContainerschiffFlotte().toString());

    }
}
