package Kdv_hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar , kdvliTutar, kdv, kdvOranı;
        System.out.println(" tutar giriniz ");
        Scanner sc = new Scanner(System.in);
        tutar = sc.nextDouble();

        if (tutar>1000) kdvOranı=0.08;
        else kdvOranı=0.18;

        kdv=tutar*kdvOranı;
        kdvliTutar=tutar+kdv;
        System.out.println("kdv = " + kdv);
        System.out.println("kdvli tutar = " + kdvliTutar);

    }



}
