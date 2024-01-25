package Kullanıcı_Girisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userNameTable="";
        String passwordTable="";
        String passwordTable2="";
        String userName = "patika";
        String password = "java";
        int select;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(password + passwordTable );
            System.out.print("Kullanızı Adını Giriniz = ");
            userNameTable = sc.next();
            System.out.print("          Şifre Giriniz = ");
            passwordTable = sc.next();

            if (!userNameTable.equals(userName) )
                System.out.println("kullanıcı adı geçersiz");
            else if (passwordTable.equals(password) && userName.equals(userNameTable) ){
                System.out.println("giriş yaptınız");
            break; }
            else if (!passwordTable.equals(password) && userName.equals(userNameTable)) {
                System.out.println("Şifre yanlış\n 1- yeni şifre gir\n 2- tekrar dene\n seçiniz ");
                select = sc.nextInt();
                if (select==2) continue;
                if (select == 1) {
                    System.out.print("Yeni şifreyi giriniz = ");
                    passwordTable2 = sc.next();
                    if (!passwordTable2.equals(passwordTable) && !passwordTable2.equals(password)) {
                        password = passwordTable2;
                        System.out.println("şifre değiştirildi, tekrar giriş yapınız");
                    }
                    else System.out.println("yeni şifre hatalı girdiğiniz veya unuttuğunuz şifre ile aynı olamaz, tekrar giriş yapınız");

                }

            }


        }


    }
}
