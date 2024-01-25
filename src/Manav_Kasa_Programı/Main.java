package Manav_Kasa_Programı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlıcan, toplam;
        Scanner sc = new Scanner(System.in);
        System.out.print("armut kg = ");
        armut = sc.nextDouble();
        System.out.print("elma kg = ");
        elma = sc.nextDouble();
        System.out.print("domates kg = ");
        domates = sc.nextDouble();
        System.out.print("muz kg = ");
        muz = sc.nextDouble();
        System.out.print("patlıcan kg = ");
        patlıcan = sc.nextDouble();

toplam = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.0);
System.out.println("Toplam tutar =" + toplam);


    }



}
