package Sınıf_Geçme_Durumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fiz,kim,tür,müz;
        int valid_lesson = 0;
        int total=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Fizik notunuz girin= ");
        fiz=sc.nextInt();
        if (fiz<=100 && fiz>=0) {
            valid_lesson++;
            total+=fiz;}

        System.out.print("Matematik notunuz girin= ");
        mat=sc.nextInt();
        if (mat<=100 && mat>=0) {
            valid_lesson++;
            total+=mat;}

        System.out.print("Türkçe notunuz girin= ");
        tür=sc.nextInt();
        if (tür<=100 && tür>=0) {
            valid_lesson++;
            total+=tür;}

        System.out.print("Kimya notunuz girin= ");
        kim=sc.nextInt();
        if (kim<=100 && kim>=0) {
            valid_lesson++;
            total+=kim;}

        System.out.print("Müzik notunuz girin= ");
        müz=sc.nextInt();
        if (müz<=100 && müz>=0) {
            valid_lesson++;
            total+=müz;}

        double ort;
        ort = (total)/valid_lesson;

        String sonuc = (ort>=55) ? "geçtiniz" : "kaldınız";

        System.out.println(sonuc + "\nortalamanız = " + ort + "\n ders sayısı = " + valid_lesson);



    }



}
