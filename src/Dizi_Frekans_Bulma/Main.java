package Dizi_Frekans_Bulma;

import java.util.Arrays;

public class Main {
static boolean check (int x,int[] list){
    for (int i:list){
     if (i==x)
         return false;
    }
        return true;
}
    public static void main(String[] args) {


        int[] list = { 10,20,20,10,10,20,5,20};
        int[] newList = new int[list.length];
        int index=0;
        int repeat=0;
        System.out.println(Arrays.toString(list));
        System.out.println("Tekrar sayıları");
        for (int i = 0; i<list.length;i++){
            repeat=1;
            for (int j = 0; j<list.length;j++) {
                if(   (list[i]==list[j]) && (i!=j) && check(list[i],newList) ) {
                    repeat++;
                }
            }
            if (check(list[i],newList)) {
                newList[index] = list[i];
                index++;
                System.out.println(list[i] + " sayısı  " + repeat + " kere tekrar edildi");
            }


        }


        }

    }

