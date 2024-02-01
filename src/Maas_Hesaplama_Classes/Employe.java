package Maas_Hesaplama_Classes;

public class Employe {
    String name;
    double salary;
    int workhours;
    int hireYear;

    public Employe(String name, double salary, int workhours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000.0)
            return 0.0;
        else
            return salary * 0.03;
    }


    public int bonus() {
        if (workhours < 40)
            return 0;
        else
            return (workhours-40) * 30;
    }
    public double raiseSalary() {
        int year=2021-hireYear;
        if (year > 19)
            return salary*0.15;
        if (year > 9 && year<20)
            return salary*0.10;
        else
            return salary * 0.05;
    }

    public void toStringg (){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Çalışma saati : " + this.workhours);

        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary-tax()+bonus()));
        System.out.println("Toplam maaş : " + (this.salary-tax()+bonus()+raiseSalary()));



    }



}