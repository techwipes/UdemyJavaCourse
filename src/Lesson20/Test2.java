package Lesson20;
import java.util.ArrayList;
public class Test2 {


    public static void main(String[] args) {
        ArrayList <String> list= new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");
        ArrayList <String> list2= new ArrayList<>();
        list2.add("Petrov");
        list2.add("Siorov");

        list.addAll(list2);
        list.addAll(1,list2);

        for (String s:list){
            System.out.print(s+ " ");
        }





    }
}
;