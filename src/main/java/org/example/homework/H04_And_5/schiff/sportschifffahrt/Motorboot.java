package org.example.homework.H04_And_5.schiff.sportschifffahrt;

public class Motorboot {
    private int leistung;
    private int anzahlMotoren;
    private String bootsname;
    private int registernummer;

    public Motorboot(int leistung, int anzahlMotoren, String bootsname, int registernummer) {
        this.leistung = leistung;
        this.anzahlMotoren = anzahlMotoren;
        this.bootsname = bootsname;
        this.registernummer = registernummer;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public int getAnzahlMotoren() {
        return anzahlMotoren;
    }

    public void setAnzahlMotoren(int anzahlMotoren) {
        this.anzahlMotoren = anzahlMotoren;
    }

    public String getBootsname() {
        return bootsname;
    }

    public void setBootsname(String bootsname) {
        this.bootsname = bootsname;
    }

    public int getRegisternummer() {
        return registernummer;
    }

    public void setRegisternummer(int registernummer) {
        this.registernummer = registernummer;
    }
}
