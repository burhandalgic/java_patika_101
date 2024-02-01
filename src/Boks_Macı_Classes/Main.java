package Boks_Macı_Classes;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("çakal carlos",100,70,10,50);
        Fighter f2 = new Fighter("kerpeten necmi",100,65,10,50);
        Match mac=new Match(f1,f2,65,70);
        mac.run();


    }



}
