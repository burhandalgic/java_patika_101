package Asal_Sayı_Bulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean asal;


        for (int i = 2; i < 101; i++) {
            asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }


            }
            if (asal)
                System.out.println(i);
        }

    }


}
