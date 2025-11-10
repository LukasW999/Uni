package org.example.marten;

public class Punkt {
    private int x;
    private int y;
    //Standartkonstruktor
    public Punkt(){
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X " + x + " Y " + y;
    }

    public void setX(int x) {
        //wenn
        this.x = x;
    }
}
