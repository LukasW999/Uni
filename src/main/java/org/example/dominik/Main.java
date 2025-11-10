package org.example.dominik;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    static String[] field = new String[9];

    public static void main(String[] args){
        while (true){

        }
    }
    public void printField(){
        System.out.println("--------------");
        System.out.println("|" + field[0] + "|" + field[1] + "|" + field[2]+ "|");
        System.out.println("--------------");
        System.out.println("|" + field[3] + "|" + field[4] + "|" + field[5]+ "|");
        System.out.println("--------------");
        System.out.println("|" + field[6] + "|" + field[7] + "|" + field[8]+ "|");
        System.out.println("--------------");
    }
    public boolean checkWinner(){
        for (int i = 0; i < field.length; i++) {
         if (i == 0){
            
         }
        }

        return false;
    }
}
