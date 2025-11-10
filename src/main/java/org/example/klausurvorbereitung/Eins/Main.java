package org.example.klausurvorbereitung.Eins;

public class Main {
    public static void main(String[] args){
        einsB();
    }

    public static void einsA(){
        int i =8;
        int a = i/0;
    }
    // B) ArithmeticException

    public static void einsB(){
        try {
            int i =8;
            int a = i/0;
        } catch (Exception e) {
            System.out.println("Du teilst durch null du lappen");
        }
    }
}
