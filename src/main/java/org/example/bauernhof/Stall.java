package org.example.bauernhof;

public class Stall {

    private Kuh[] kuehe;

    public Stall(Kuh[] kuehe) {
        this.kuehe = kuehe;
    }

    void alterAendernKueh(int alter, int nummer) {
        kuehe[nummer - 1].setAlter(alter);
    }

    int anzahlKuehe() {
        return kuehe.length;
    }

    int durschnittsAlter() {
        int gesamtesAlter = 0;
        for (int i = 0; i < kuehe.length; i++) {
            gesamtesAlter += kuehe[i].getAlter();
        }
        return gesamtesAlter / kuehe.length;
    }

    int anzahlGeschlecht(int geschlecht) {
        int anzahlKueheMitPassendemGeschlecht = 0;
        for (Kuh kuh : kuehe) {
            if (kuh.getGeschlecht() == geschlecht) {
                anzahlKueheMitPassendemGeschlecht++;
            }
        }
        return anzahlKueheMitPassendemGeschlecht;
    }
}
