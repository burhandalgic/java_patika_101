package Yıldızlardan_Elmas_Yapımı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("sayı giriniz = ");
        n=sc.nextInt();
        int b,y;


        for(int i=1;i<=n;i++){
            b=n-i;
            y=(2*i)-1;
            for (int x=0;x<b;x++)
                System.out.print(" ");
            for (int x=0;x<y;x++)
                System.out.print("*");
            System.out.println();
        }


        for(int i=n-1;i>=1;i--){
            b=n-i;
            y=(2*i)-1;
            for (int x=0;x<b;x++)
                System.out.print(" ");
            for (int x=0;x<y;x++)
                System.out.print("*");
            System.out.println();
        }


    }
}
