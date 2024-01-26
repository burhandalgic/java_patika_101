package Armstrong_Sayı_bulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

    for (int number=1; number<1000;number++){

        int basamak,arm=0;
        basamak=basSayısı(number);

        int numberTemp=number;
        for(int i=0;i<basamak;i++){
            int rakam=numberTemp%10;
            numberTemp=numberTemp/10;
            arm=arm+üstal(rakam,basamak);
        }
    if (number==arm)
        System.out.println(number);


}


    }



    public static int üstal(int x,int y) {
        int result=1;
        for (int i=0;i<y;i++)
            result=result*x;
        return result;

    }
    public static int basSayısı(int number) {
        int numberTemp=number;
        int result=0;

        while (numberTemp!=0){
            numberTemp=numberTemp/10;
                    result++;
        }
        return result ;

    }


    }

