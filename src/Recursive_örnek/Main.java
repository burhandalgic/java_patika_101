package Recursive_örnek;
import javax.swing.*;
import java.util.Scanner;
public class Main {
    static void islem (int a,int aTemp,boolean b){
        System.out.print(aTemp+ " ");

        if (b==false)
            aTemp=aTemp-5;
        else
            aTemp += 5;

        if (aTemp<=0)
            b=true;

        if (b==true && (aTemp>a))
            return;
        else
            islem(a,aTemp,b);

    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int number=0;
        System.out.print("N sayısı = ");
        number=sc.nextInt();
        System.out.print("Çıktı = " );
        islem(number,number,false);
    }
    }

