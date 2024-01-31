package Student_Information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Teacher t1 =new Teacher("Ahmet Kural", "0501","MAT");
        Teacher t2 =new Teacher("Murat Cemcir", "0502", "TÜR");
        Teacher t3 = new Teacher("Çağlar Çorumlu", "0503", "FİZ");

        Courses matematik = new Courses("MATEMATİK", "MAT");
        Courses turkce = new Courses("TÜRKÇE","TÜR" );
        Courses fizik = new Courses("FİZİK", "FİZ");

        matematik.addTeacher(t1);
        turkce.addTeacher(t2);
        fizik.addTeacher(t3);

        Student s1 = new Student("burhan dalgıç", "101", 3,matematik,turkce,fizik);
        s1.addBulkExamNote();
        s1.printInformation();





    }
}
