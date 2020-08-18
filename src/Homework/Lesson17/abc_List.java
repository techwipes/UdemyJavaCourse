package Homework.Lesson17;

import java.util.ArrayList;
import java.util.Collections;

public class abc_List {

    public static ArrayList <String> abc(String ... str){

        ArrayList <String> rezult= new ArrayList<>();
        for (String s: str){
            if (!rezult.contains(s)) {
                rezult.add(s);
            }
        }
        Collections.sort(rezult);
        System.out.println(rezult);
        return rezult;
    }


    public static void main(String[] args) {

        abc("fafa","fafa", "lalal", "tutut","aaa");



    }
}
