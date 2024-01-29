package Üslü_Sayı_Recursive;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {

    static int pow(int a,int b){
        int result;
        if (b==1)
            return a;
        result=a*pow(a,b-1);
        return result;

    }


    public static void main(String[] args) {

        int x,y;
        Scanner sc=new Scanner(System.in);

        System.out.print("Taban değerini giriniz = ");
        x=sc.nextInt();
        System.out.print("Üs değerini giriniz = ");
        y=sc.nextInt();
        System.out.print("Sonuç = "+ pow(x,y));




    }
}
