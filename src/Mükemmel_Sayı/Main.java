package Mükemmel_Sayı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number,total=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Bir sayı giriniz= ");
      number=sc.nextInt();

      for(int i=1;i<number;i++){
          if (number%i==0)
              total+=i;
      }
      if (total==number)
          System.out.println(number + " mükemmel sayıdır");
      else
          System.out.println(number + " mükemmel sayı değildir");


    }



}
