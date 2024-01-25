package Hesap_Makinesi_Switch_Case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1,n2;
        int select;
        Scanner sc = new Scanner(System.in);

        System.out.println(" ilk sayıyı giriniz= ");
        n1=sc.nextInt();
        System.out.println(" ilk sayıyı giriniz= ");
        n2=sc.nextInt();
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\nSeçiniz");
        select=sc.nextInt();


        switch (select){
            case 1:
                System.out.println("Toplam =" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma =" + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım =" + (n1*n2));
                break;
            case 4:
                if (n2==0) System.out.println("Bir sayı sıfıra bölünemez");
                else {
                    double x=(n1/n2);
                    System.out.println("Bölüm =" + x);

                }
                break;
            default: System.out.println("Yanlış seçim");
        }



    }



}
