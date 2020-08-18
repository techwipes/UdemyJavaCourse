package Lesson20;

import javax.swing.*;
import java.util.ArrayList;

public class test5 {

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("hello");

        for (String s:list){
            System.out.print(s+" ");
        }

        System.out.println(list.indexOf(new String("poka")));


        System.out.println(list);
    }
}
