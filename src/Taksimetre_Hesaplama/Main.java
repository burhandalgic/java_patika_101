package Taksimetre_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, tutar;
        Scanner sc = new Scanner(System.in);

        System.out.println(" km yi giriniz= ");
        km=sc.nextDouble();

        tutar = 10+(km*2.2);
        tutar=(tutar<20)?20:tutar;

        System.out.println("tutar =" + tutar);
    }



}
