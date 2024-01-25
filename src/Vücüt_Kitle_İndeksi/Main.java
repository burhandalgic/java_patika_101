package Vücüt_Kitle_İndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg,boy,vki;
        Scanner sc = new Scanner(System.in);

        System.out.print(" boyunuzu metre olarak giriniz = ");
        boy=sc.nextDouble();

        System.out.print(" kilonuzu giriniz = ");
        kg=sc.nextDouble();

        vki = kg/(boy*boy);
        System.out.println(" vücut kitle indeksiniz =" + vki);
    }



}
