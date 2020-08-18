package Lesson19;

public class Test6 {


    public static void main(String[] args) {


        int[][] array2 = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};

    /* Метод вывода массива на экран с помощью традиционного медота for

     for (int i = 0; i < array2.length; i++){
            for (int j =0; j <array2[i].length;j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();

       }
     */


        for (int [] array3:array2) {
            for (int a:array3) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}