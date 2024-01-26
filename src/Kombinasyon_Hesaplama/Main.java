package Kombinasyon_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n,r,result;
        System.out.print("n değerini giriniz =");
        n= sc.nextInt();
        System.out.print("r değerini giriniz =");
        r= sc.nextInt();

        result=faktör(n)/(faktör(r)*faktör(n-r));

        System.out.print("C("+n+ ","+ r + ") = "+result);


    }



    public static int faktör(int n) {
        int x=1;
        for (int i=1;i<=n;i++)
            x*=i;
    return x;

    }
    }

