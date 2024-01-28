package Sayı_Bulma;

import java.awt.geom.Arc2D;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total,number,numBig,numSmall;
      Scanner sc = new Scanner(System.in);
      System.out.println("Kaç adet sayı gireceksiniz");
      total=sc.nextInt();

      if (total>0)
          System.out.print("Sayı giriniz = ");
        number=sc.nextInt();
        numBig=number;
        numSmall=number;

      for(int i=1;i<total;i++){
          System.out.print("Sayı giriniz = ");
          number=sc.nextInt();

          if (number>numBig)
              numBig=number;
          if (number<numSmall)
              numSmall=number;
      }

      System.out.println("En büyük sayı = " + numBig);
        System.out.println("En küçük sayı = " + numSmall);


    }



}
