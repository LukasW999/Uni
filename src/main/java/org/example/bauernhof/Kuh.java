package org.example.bauernhof;

public class Kuh {
    private int alter;
    private String name;
    private int geschlecht;

    public Kuh(int alter, String name) {
        this.alter = alter;
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(int geschlecht) {
        this.geschlecht = geschlecht;
    }
}
