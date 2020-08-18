package Lesson26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);  //autoboxing int -> Integer
        int a = list.get(0); // unboxing Integer -> int

        Number b = new Integer(10);
        int c = (int) b;


        // Parsing

        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1);
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(i1);
        System.out.println(b1);

        //valueOf

        Integer i3 = Integer.valueOf(10);
        Double d2 = Double.valueOf(s3);
        Byte b10 = ((byte) 5);

    }
}
