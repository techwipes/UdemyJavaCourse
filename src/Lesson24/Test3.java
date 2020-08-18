package Lesson24;

public class Test3 {
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



class Teacher extends Employee implements Helpable {
    int kolichestvouchenikov;

    void uchit() {
        System.out.println("Uchit");

    }

    public void pomosh() {
        System.out.println("okazivaet pomosh");
    }


    public void tushitPojar() {
        System.out.println("Tushit pojar");
    }

}


    class Driver extends Employee implements Helpable, Swim_able {
        String nazvaniyeMasini;

        void vodit() {
            System.out.println("Vodit");
        }


        public void pomosh() {
            System.out.println("okazivaet pomosh");
        }


        public void tushitPojar() {
            System.out.println("Tushit pojar");
        }

        public void swim(){
            System.out.println("Plavaet");
        }

    }


    interface Helpable {
        void pomosh();

        void tushitPojar();
    }

    interface Swim_able {
        void swim();
    }
