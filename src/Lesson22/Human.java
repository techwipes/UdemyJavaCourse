package Lesson22;

public class Human {

    public String name;
    public static int salary=150;

    public void work(){System.out.println("rabotat");}
    public static void rest(){System.out.println("Otdihaet");}


}


class Student extends Human{

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.salary);
        s.work();
        rest();





    }
}