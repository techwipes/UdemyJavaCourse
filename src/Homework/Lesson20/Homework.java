package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Homework {

    public static ArrayList abc(String... str) {
        ArrayList<String> total = new ArrayList<String>();
        for (String s:str) {
            if(!total.contains(s)) {
                total.add(s);
            }

        }


        Collections.sort(total);
        System.out.println(total);
        return total;
    }


    public static void main(String[] args) {
        abc("A","B","C","B","D");
        Integer i = 5000;
        System.out.println(i.hashCode());
    }
}
