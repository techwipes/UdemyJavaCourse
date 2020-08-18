package Lesson22;

public class Test3 {

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.age= 27;
        doc.experience= 16;
        doc.name="Ivan";
        doc.specializaciya="hirurg";
        doc.lechit();
        doc.eat();
        doc.sleep();




    }


}










class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Кушать!");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

    class Doctor extends Employee {
        String specializaciya;

        void lechit() {
            System.out.println("Lechit");
        }
    }


    class Teacher extends Employee {
        int kolichestvouchenikov;

        void uchit() {
            System.out.println("Uchit");
        }
    }


    class Driver extends Employee {
        String nazvaniyeMasini;

        void vodit() {
            System.out.println("Vodit");
        }
    }
