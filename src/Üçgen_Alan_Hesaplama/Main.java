package Üçgen_Alan_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k1,k2,k3;
        double u,a;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.kenar uzunluğunu giriniz= ");
        k1=sc.nextInt();

        System.out.println("2.kenar uzunluğunu giriniz= ");
        k2=sc.nextInt();

        System.out.println("3.kenar uzunluğunu giriniz= ");
        k3=sc.nextInt();

        u=(k1+k2+k3)/2;
        a=u*(u-k1)*(u-k2)*(u-k3);
        System.out.println("Alan =" + Math.sqrt(a));

    }



}
