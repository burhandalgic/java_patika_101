package Atm_Projesi;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String pasword,userName;
        int tryNumber=3;
        int select;
        int balance=1000;
        int addValue;
        int subValue;

        Scanner sc = new Scanner(System.in);

        while(tryNumber>0) {
            System.out.print("Kullanıcı adınızı giriniz = ");
            userName = sc.nextLine();
            System.out.print("Şifrenizi giriniz = ");
            pasword = sc.nextLine();

            if (pasword.equals("java") && userName.equals("patika")){
                System.out.println("Giriş yapıldı");

                do {
                   System.out.print("1- Bakiye görüntüleme\n" +
                           "2- Para yükleme\n" +
                           "3- Para çekme\n" +
                           "4- çıkış\nSeçim yapınız  = ");
                   select = sc.nextInt();

                   switch (select){
                       case 1:
                           System.out.println(balance);
                           break;
                       case 2:
                           System.out.print("yüklenecek mikar = ");
                           addValue=sc.nextInt();
                           balance+=addValue;
                           break;
                       case 3:
                           System.out.print("çekilecek mikar = ");
                           subValue=sc.nextInt();
                           if (subValue<=balance)
                           balance-=subValue;
                           else
                               System.out.println("bakiye yetersiz");
                           break;
                   }





                }while (select!=4);



System.out.println("Çıkış yapıldı");
                break;
            }else {
                tryNumber--;
                if (tryNumber!=0)
                System.out.println("hatalı giriş, kalan hakkınız " + tryNumber);
                if (tryNumber==0)
                    System.out.println("hesabınız bloke oldu! ");
            }
        }






}
    }


