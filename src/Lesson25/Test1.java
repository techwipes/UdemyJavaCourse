package Lesson25;

import javax.print.Doc;

public class Test1 {

    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
        Doctor doc1 = new Doctor();
        Teacher teac1 = new Teacher();
        Help_able h = new Teacher();

     //   Driver [] array1 = {new Driver(), new Driver()};
     //   Employee [] array2  = {new Teacher(), new Doctor()};


        emp1.sleep();
        emp1.work();
        teac1.help();
        h.help();
        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);

    }
}




abstract class Employee implements Help_able{
    void sleep(){System.out.println("Employee sleeps");
    }
    abstract void work();
}


class Teacher extends Employee implements Help_able{
    void work(){
        System.out.println("Teacher works");}
    public void help(){
        System.out.println("Teacher helps");
    }
        }

class Driver extends Employee {
    void work() {
        System.out.println("Driver works"); }
    public void help(){
        System.out.println("Driver helps");
    }

}

class Doctor extends Employee {
    void work() {
        System.out.println("Doctor works");}
    public void help(){
        System.out.println("Doctor helps");
    }
}

interface Help_able{
    void help();
}