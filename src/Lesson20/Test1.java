package Lesson20;
import java.util.ArrayList;
public class Test1 {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));




        ArrayList <String> list2 = new ArrayList<String>();
        ArrayList <StringBuilder> list3 = new ArrayList<>();
        list2.add("poka");
        list2.add("s");


     ArrayList <String> list5 = new ArrayList<>(list2);

    }
}



class Car{}
class Student{}