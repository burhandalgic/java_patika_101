package Daire_Diliminin_Alanı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r , açı , alan, pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yarıçap giriniz =");
        r= sc.nextDouble();
        System.out.print("Açı giriniz =");
        açı= sc.nextDouble();

        alan=(pi*r*r*açı)/360;

        System.out.println("Alan = " + alan);
    }



}
