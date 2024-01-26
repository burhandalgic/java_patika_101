package UcakBileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, age,select;
        double totalPrice=0,firstPrice=0,ageDiscount=0,pricePerKm=0.10;
        Scanner sc = new Scanner(System.in);
        System.out.print(" km yi giriniz= ");
        km = sc.nextInt();
        System.out.print(" yaş ı giriniz= ");
        age = sc.nextInt();
        System.out.print(" 1- tek yön\n2- çift yön\ntipi seçiniz= ");
        select = sc.nextInt();
        if (km>0 && age>0 && (select==1||select ==2)){

            firstPrice = km*pricePerKm;

            if (age<12)
                ageDiscount=firstPrice*0.5;
            else if (age<24 && age>=12)
                ageDiscount=firstPrice*0.1;
            else if (age>=65)
                ageDiscount=firstPrice*0.3;

            if (select==1)
                totalPrice=firstPrice-ageDiscount;
            if (select==2) {
                totalPrice=(firstPrice-ageDiscount)*1.6;
            }

        }
        else
            System.out.println("hatalı veri girdiniz");

        System.out.println("ilk fiyat =" + firstPrice + "\nindirimli fiyat=" + totalPrice);

    }



}
