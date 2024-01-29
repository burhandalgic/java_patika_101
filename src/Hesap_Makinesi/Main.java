package Hesap_Makinesi;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {

    static void add(int x,int y){
        System.out.println(x+y);
    }
    static void sub(int x,int y){
        System.out.println(x-y);
    }
    static void mul(int x,int y){
        System.out.println(x*y);
    }
    static void div(int x,int y){
        System.out.println(x/y);
    }
    static void pow(int x,int y){
        int result=1;
        for (int i=0;i<y;i++)
            result=result*x;
        System.out.println(result);
    }
    static void fac(int x){
        int result=1;
        for (int i=x;i>1;i--){
            result=result*i;
        }
        System.out.println(result);
    }
    static void mod(int x,int y){
        System.out.println(x%y);
    }


    public static void main(String[] args) {
        int select,a=0,b=0;
        Scanner sc = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
while (true) {
    System.out.print("Bir seçin Yapınız = ");
    select = sc.nextInt();
    if (select==0)
        break;
    else
    {
        System.out.println("birinci sayıyı giriniz = ");
        a=sc.nextInt();
        if (select!=6) {
            System.out.println("ikinci sayıyı giriniz = ");
            b = sc.nextInt();
        }
        switch (select){
            case 1:
                add(a,b);
                break;
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            case 4:
                if (b==0){
                    System.out.println("ikinci sayı 0 olamaz");
                }else
                div(a,b);
                break;
            case 5:
                pow(a,b);
                break;
            case 6:
                fac(a);
                break;
            case 7:
                mod(a,b);
                break;
            default:
                System.out.println("tanımsız giriş");
        }



    }


}
        System.out.println("çıkış yapıldı");




}
}


