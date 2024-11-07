package org.example.homework.H04;

import java.util.HashMap;
import java.util.Map;

/**
 * Hausaufgabe Nr. 4
 */
class Containerschiff {
    public static HashMap<String, Containerschiff> containerschiffFlotte = new HashMap<>();
    private String taufName;
    private int schiffslaenge;
    private int anzahlStellplaetze;
    private int anzahlFreieStellplaetze;
    private int anzahlBeladeneContainer;
    private int brz; //Bruttoraumzahl

    /**
     * Erstellt ein neues Schiff
     *
     * @param taufName
     * @param anzahlStellplaetze
     * @param schiffslaenge         die Schiffslänge in Nautischem Fuß
     * @param brz                   die Bruttoraumzahl
     * @throws ExceptionInInitializerError Wenn die flotte null ist, der Name schon vergeben ist oder
     *                                     die Anzahl der Stellplätze unter 1000 ist.
     */
    public Containerschiff(String taufName, int anzahlStellplaetze, int schiffslaenge, int brz)
            throws ExceptionInInitializerError {
        if (containerschiffFlotte.containsKey(taufName) || anzahlStellplaetze < 1000) {
            throw new ExceptionInInitializerError("Der Name ist bereits vergeben oder" +
                    " die Anzahl der Stellplätzen ist unter 1000");
        }
        this.taufName = taufName;
        this.anzahlStellplaetze = anzahlStellplaetze;
        this.schiffslaenge = schiffslaenge;
        this.brz = brz;
        containerschiffFlotte.put(taufName, this);
    }

    /**
     * Belädt das Schiff.
     *
     * @param anzahlZuBeladeneContainer
     * @param teu20                     true, wenn die Container 20TEU groß sind, false wenn 40.
     * @return false, wenn nicht mehr genug Stellplätze da sind oder das brz überschritten wird.
     * Ansonsten true.
     */
    public boolean beladen(int anzahlZuBeladeneContainer, boolean teu20) {
        if (anzahlZuBeladeneContainer * (teu20 ? 1 : 2) > anzahlFreieStellplaetze ||
                anzahlZuBeladeneContainer * (teu20 ? 33 : 68) > brz) {
            return false;
        }
        anzahlFreieStellplaetze += anzahlZuBeladeneContainer * (teu20 ? 1 : 2);
        anzahlBeladeneContainer += anzahlZuBeladeneContainer;
        brz += anzahlZuBeladeneContainer * (teu20 ? 33 : 68);
        return true;
    }

    /**
     * Entlädt das Schiff komplett.
     *
     * @return die Anzahl entladener Container.
     */
    public int entladen() {
        int anzahlBeladenderContainerTemp = anzahlBeladeneContainer;
        anzahlBeladeneContainer = 0;
        anzahlFreieStellplaetze = anzahlStellplaetze;
        brz = 0;
        return anzahlBeladenderContainerTemp;
    }

    /**
     * @return die Schiffslänge in Meter.
     */
    public int schiffslaengeInMeter() {
        return schiffslaenge / 3;
    }

    public Map<String, Containerschiff> getContainerschiffFlotte() {
        return containerschiffFlotte;
    }

    public String getTaufName() {
        return taufName;
    }

    public int getSchiffslaenge() {
        return schiffslaenge;
    }

    public int getAnzahlStellplaetze() {
        return anzahlStellplaetze;
    }

    public int getAnzahlFreieStellplaetze() {
        return anzahlFreieStellplaetze;
    }

    public int getAnzahlBeladeneContainer() {
        return anzahlBeladeneContainer;
    }

    public int getBrz() {
        return brz;
    }

    @Override
    public String toString() {
        return "Containerschiff{" +
                " taufName='" + taufName + '\'' +
                ", schiffslaenge=" + schiffslaenge +
                ", anzahlStellplaetze=" + anzahlStellplaetze +
                ", anzahlFreieStellplaetze=" + anzahlFreieStellplaetze +
                ", anzahlBeladeneContainer=" + anzahlBeladeneContainer +
                ", brz=" + brz +
                '}';
    }
}
