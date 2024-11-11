package org.example.homework.H04_And_5.schiffsfahrt;

public class Hafen {
    private final String nameStadt;
    private final String land;
    private String internationalesKuerzel;

    public Hafen(String nameStadt, String land, String internationalesKuerzel) {
        this.nameStadt = nameStadt;
        this.land = land;
        this.internationalesKuerzel = internationalesKuerzel;
    }

    public String getInternationalesKuerzel() {
        return internationalesKuerzel;
    }

    public void setInternationalesKuerzel(String internationalesKuerzel) {
        this.internationalesKuerzel = internationalesKuerzel;
    }
}
