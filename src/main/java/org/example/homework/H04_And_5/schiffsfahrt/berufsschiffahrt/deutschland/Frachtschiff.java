package org.example.homework.H04_And_5.schiffsfahrt.berufsschiffahrt.deutschland;

import org.example.homework.H04_And_5.schiffsfahrt.Hafen;

public class Frachtschiff extends Containerschiff {
    private int ladevolumen = -1;
    private final double SCHIFFSGROESSENFAKTOR = 1.1;

    public Frachtschiff(String taufName, int schiffslaenge) throws ExceptionInInitializerError {
        super(taufName, -1, schiffslaenge, -1, null);
    }

    public Frachtschiff(String taufName, int schiffslaenge, Hafen heimathafen) throws ExceptionInInitializerError {
        super(taufName, -1, schiffslaenge, -1, heimathafen);
    }

    public Frachtschiff(String taufName, int anzahlStellplaetze, int schiffslaenge, Hafen heimathafen, int ladevolumen) throws ExceptionInInitializerError {
        super(taufName, anzahlStellplaetze, schiffslaenge, -1, heimathafen);
        this.ladevolumen = ladevolumen;
        setBrz(berechneBrz());
    }

    protected double berechneBrz() {
        return ladevolumen * SCHIFFSGROESSENFAKTOR;
    }
}
