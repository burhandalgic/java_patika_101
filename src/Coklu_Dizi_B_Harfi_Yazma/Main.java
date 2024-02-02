package Coklu_Dizi_B_Harfi_Yazma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       String[][] list = new String[5][3];
       for (int i=0;i<5;i++){
           for (int j=0;j<3;j++){
               if (i==0||i==2||i==4||j==0||j==2){
                   list[i][j]= " *";
               }else
                   list[i][j]= "  ";

           }
       }

        for (int i=0;i<5;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list[i][j]);
            }
            System.out.println();
        }


        }

    }

