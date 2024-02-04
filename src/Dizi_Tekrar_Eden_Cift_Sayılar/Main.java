package Dizi_Tekrar_Eden_Cift_Sayılar;

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


        int[] list = { 100,24,56,100,77,35,80,99,24,80,23};
        int[] newList = new int[list.length];
        int index=0;
        for (int i = 0; i<list.length;i++){
            for (int j = 0; j<list.length;j++) {
                if(   (list[i]==list[j]) && (i!=j) && (list[i]%2==0) && check(list[i],newList) ) {
                    newList[index]=list[i];
                   index=index+1;
                }
            }
        }
        Arrays.sort(newList);
        for (int i=0 ; i < newList.length;i++){
            if (newList[i]!=0)
                System.out.println(newList[i]);
        }


        }

    }

