package ArtıkYıl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        boolean artık=false;
        String sonuc="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Yıl giriniz =");
        year=sc.nextInt();

        if (year%4==0)
            artık=true;

        if (year%100==0){
            if (year%400!=0)
                artık = false;
        }

        sonuc = artık ? " bir artık yıldır": " bir artık yıl değildir";

        System.out.println(year + sonuc);



    }



}
