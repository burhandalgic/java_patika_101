package Student_Information_classes;

public class Courses {
    Teacher teacher;
    String name;
    String branchCode;
    int noteExam;
    int noteViva;

    public Courses(String name, String branchCode) {
        this.name = name;
        this.branchCode = branchCode;
        this.noteExam = 0;
        this.noteViva = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branchCode==this.branchCode) {
            this.teacher = teacher;
            System.out.println( this.name + " teacher appointed : " + teacher.name);
        }
        else
            System.out.println("unvalid input");
    }


}
