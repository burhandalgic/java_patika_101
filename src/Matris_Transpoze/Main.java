package Matris_Transpoze;

import java.util.Arrays;

public class Main {
    static void printt (int [][] list){
        for (int i=0;i<list.length;i++){
            for (int j=0;j< (list[i].length);j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpoze(int [][] list){
        int[][]newlist = new int[list[0].length][list.length];
        for (int i=0;i<newlist.length;i++) {
            for (int j = 0; j < (newlist[i].length); j++) {
                newlist[i][j] = list[j][i];
            }
        }

     return newlist;
    }



    public static void main(String[] args) {
        int[][] list = {{1,2,3,4},{5,6,7,8}};
        printt(list);
        printt(transpoze(list));

    }
}
