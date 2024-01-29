package Palindrom_Sayı;

import java.util.Scanner;

public class Main {


    static boolean palidrom (int number){
    int reserveNumber=0,temp=number,lastNumber=0;

    while (temp!=0){
        lastNumber=temp%10;
        reserveNumber=(reserveNumber*10)+lastNumber;
        temp=temp/10;
    }

    if (reserveNumber==number)
        return true;
    else
        return false;


    }


    public static void main(String[] args) {

        System.out.println(palidrom(4574));




    }
}
