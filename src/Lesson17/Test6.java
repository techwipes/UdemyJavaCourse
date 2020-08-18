package Lesson17;

import java.util.Arrays;

public class Test6 {

    public static void minMax(int []array) {

        int x = array.length;
        Arrays.sort(array);

        System.out.println("Minimalnoye znacheniye massiva ravno: " + array[0]);
        System.out.println("Mazimalnoye znacheniye massiva ravno: " + array[x-1]);
    }




    public static void main(String[] args) {



            int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
            minMax(array1);


        }




    }

