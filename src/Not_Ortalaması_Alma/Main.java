package Not_Ortalaması_Alma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fiz,kim,bio,geo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Fizik notunuz girin= ");
        fiz=sc.nextInt();

        System.out.println("Matematik notunuz girin= ");
        mat=sc.nextInt();

        System.out.println("Bioloji notunuz girin= ");
        bio=sc.nextInt();

        System.out.println("Kimya notunuz girin= ");
        kim=sc.nextInt();

        System.out.println("Geometri notunuz girin= ");
        geo=sc.nextInt();

        double ort;
        ort = (fiz+kim+bio+mat+geo)/5;

        String sonuc = (ort>=60) ? "geçer" : "kaldı";

        System.out.println("ortalamanız" + ort + sonuc);



    }



}
