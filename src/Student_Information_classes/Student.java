package Student_Information_classes;

import java.util.Scanner;

public class Student {
    Courses c1,c2,c3;
    String name;
    String no;
    int classes;
    double average;

    Boolean isPass;

    public Student(String name, String no, int classes,Courses c1, Courses c2, Courses c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.no = no;
        this.classes = classes;
        this.average = 0.0;
        this.isPass = false;
    }
    Scanner sc= new Scanner(System.in);
    void addBulkExamNote(){
       // Scanner sc= new Scanner(System.in);
        System.out.print(this.c1.name + " yazılı notunu giriniz= ");
        this.c1.noteExam=sc.nextInt();
        System.out.print(this.c1.name + " sözlü notunu giriniz= ");
        this.c1.noteViva=sc.nextInt();
        System.out.print(this.c2.name + " yazılı notunu giriniz= ");
        this.c2.noteExam=sc.nextInt();
        System.out.print(this.c2.name + " sözlü notunu giriniz= ");
        this.c2.noteViva=sc.nextInt();
        System.out.print(this.c3.name + " yazılı notunu giriniz= ");
        this.c3.noteExam=sc.nextInt();
        System.out.print(this.c3.name + " sözlü notunu giriniz= ");
        this.c3.noteViva=sc.nextInt();
    }


    void calcAvarage(){
        this.average=((c1.noteExam*0.8+c1.noteViva*0.2)+(c2.noteExam*0.8+c2.noteViva*0.2)+(c3.noteExam*0.8+c3.noteViva*0.2))/3;
        if (this.average>=55)
            this.isPass=true;
        else
            this.isPass=false;
    }

    void printInformation(){
        calcAvarage();
        String text;
        text=isPass?" - Geçtiniz !" : " - Kaldınız !";
        System.out.println(this.name+ " ortalamanız = " + this.average + text );

    }





}