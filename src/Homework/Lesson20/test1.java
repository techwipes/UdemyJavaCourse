package Homework.Lesson20;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<String> total = new ArrayList<String>();
        total.add("1");
        total.add("1");
        total.add("1");

        System.out.println(total);
        System.out.println(total.size());
        total.remove(0);
        System.out.println(total.size());
    }
}
