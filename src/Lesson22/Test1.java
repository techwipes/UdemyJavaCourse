package Lesson22;

import Lesson22.Chelovek;
public class Test1 {


    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Ivan");
        c.setVes(55);
        c.setVosrast(22);

        System.out.println(c.getName());
        System.out.println(c.getVes());
        System.out.println(c.getVosrast());



    }
}
