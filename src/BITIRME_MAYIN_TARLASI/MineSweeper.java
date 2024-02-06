package BITIRME_MAYIN_TARLASI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int targetNumber;

    char[][] mapListFirst;
    char[][] boardList ;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mapListFirst=new char[rowNumber][colNumber];
        this.boardList = new char[rowNumber][colNumber];
        this.boardList = new char[rowNumber][colNumber];
    }

    public void run() {

        creatStarAndBoard();
        System.out.println("Mayın tarlası oyununa hoşgeldiniz. ");
        int x=0;
        int y=0;
        Scanner sc = new Scanner(System.in);
        while (true){
            print(boardList);
            System.out.print("Satır giriniz : ");
            x= sc.nextInt();
            System.out.print("Sütun giriniz : ");
            y= sc.nextInt();

            if (x<0 || x>=rowNumber || y<0 || y>=colNumber ){
                System.out.println("Matris dışı sayı girdiniz tekrar deneyiniz.");
                continue;
            }

            if (mapListFirst[x][y]=='9'){
                System.out.println("Game Over!");
                printStar(mapListFirst);
                break;

            }
            if (boardList[x][y]!='-')
                System.out.println("Daha önce denenmiş koordinat, tekrar deneyin!");
            else{
                boardList[x][y]=mapListFirst[x][y];
            targetNumber--;
            if (targetNumber==0){
                System.out.println("KAZANDINIZ , TEBRİKLER");
                break;
            }
            }
        }



    }

    public void creatStarAndBoard() {
        ArrayList<Integer> starList = new ArrayList<Integer>();
        int starNumber = (rowNumber * colNumber) / 4;
        targetNumber = (rowNumber * colNumber)-starNumber;
        boolean check = false;

        for (int i = 0; i < starNumber; ) {
            check = false;

            int randomNumber = (int) (Math.random() * rowNumber * colNumber);
            for (int x : starList) {
                if (x == randomNumber) {
                    check = true;
                    break;
                }
            }

            if (check == false) {
                starList.add(randomNumber);
                i++;
            }
        }

        int counter = 0;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                boardList[i][j]='-';
                for (int x : starList) {
                    if (x == counter)
                        mapListFirst[i][j] = '9';
                }
                counter++;
            }
        }
        int x,y,sum;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                sum=0;
                if (mapListFirst[i][j]!='9') {

                    x = i;
                    y = j + 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                            sum++;
                    x = i + 1;
                    y = j;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i + 1;
                    y = j + 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i;
                    y = j - 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i - 1;
                    y = j;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i - 1;
                    y = j - 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i - 1;
                    y = j + 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;
                    x = i + 1;
                    y = j - 1;
                    if (x < rowNumber && x >= 0 && y < colNumber && y >= 0 && mapListFirst[x][y] == '9')
                        sum++;

                    mapListFirst[i][j] = Integer.toString(sum).charAt(0);                }
            }
        }



        }






        public void print(char [][] list){
            System.out.println("***************");
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < list[0].length; j++) {
                    System.out.print(list[i][j] + " ");
                }
                System.out.println();
        }
            System.out.println();
    }

    public void printStar(char [][] list){
        System.out.println("***************");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j]=='9')
                    System.out.print("* ");
                else
                System.out.print("- ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
