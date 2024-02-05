package Deneme;

import java.util.Scanner;

public class Main {
    public static boolean canWin(int leap, int[] game) {
        int n=game.length;
        int i=0;
        boolean back=false;
        boolean front=false;
        while (true){

            if ( (i+leap)>=n || i==n-1)
                return true;

            if ( (game[i+leap]==0 ) ) {
                i=i+leap;
                front=false;
                back=false;
                continue;}

            if ( (game[i+1]==0 && back!=true ) ){
                i++;
                front=true;
                back=false;
                continue;}

            if (i>0){
                if ( (game[i-1]==0) && front!=true) {
                    i--;
                    front=false;
                    back=true;
                    continue;
                }
            }

            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int k=0;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
        System.out.println(k);
    }
}

