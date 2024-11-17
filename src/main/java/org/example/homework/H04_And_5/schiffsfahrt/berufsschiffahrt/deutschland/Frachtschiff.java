package org.example.homework.H04_And_5.schiffsfahrt.berufsschiffahrt.deutschland;

import org.example.homework.H04_And_5.schiffsfahrt.Hafen;

public class Frachtschiff extends Containerschiff {
    /**
     * Erstellt ein neues Schiff
     *
     * @param taufName
     * @param anzahlStellplaetze
     * @param schiffslaenge      die Schiffslänge in Nautischem Fuß
     * @param brz                die Bruttoraumzahl
     * @param hafen
     * @throws ExceptionInInitializerError Wenn die flotte null ist, der Name schon vergeben ist oder
     *                                     die Anzahl der Stellplätze unter 1000 ist.
     */
    public Frachtschiff(String taufName, int anzahlStellplaetze, int schiffslaenge, int brz, Hafen hafen) throws ExceptionInInitializerError {
        super(taufName, anzahlStellplaetze, schiffslaenge, brz, hafen);
    }
}
