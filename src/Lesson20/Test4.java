package Lesson20;
import  java.util.ArrayList;
public class Test4 {

    public static void main(String[] args) {
        ArrayList <StringBuilder> list= new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));

        for (StringBuilder s:list){
            System.out.print(s+" ");
        }

        System.out.println(list.indexOf(new StringBuilder("poka")));


    }
}
