package org.example.bauernhof;

public class Main {
    public static void main(String[] args) {
        Kuh berta = new Kuh(2, "berta");
        Kuh hon = new Kuh(5, "hon");
        Kuh han = new Kuh(1, "han");
        Stall s = new Stall(new Kuh[]{berta, hon, han});
    }
}
