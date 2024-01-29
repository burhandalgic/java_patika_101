package Asal_Sayı_Recursive;

import java.util.Scanner;

public class Main {

    static boolean asal (int a,int b){
        boolean result=false;
        if (a==0 || a==1)
            return false;
        if (a==b)
            return true;

        System.out.println(b);
        if (a%b==0)
            return false;
        else {
            b++;
            return asal(a, b);
        }
    }


    public static void main(String[] args) {

        int x;
        boolean result;
        Scanner sc=new Scanner(System.in);

        System.out.print("Sayı giriniz = ");
        x=sc.nextInt();
        result=asal(x,2);

        if (result==true)
        System.out.print(x+ "Sayısı asaldır !");
        if (result==false)
            System.out.print(x+ "Sayısı asal değidlir !");




    }
}
