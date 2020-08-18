package Lesson19;

public class Test8 {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
            System.out.print(array[i]);
        }
        System.out.println();

        for (int b : array) {
            b += b;
            System.out.print(b);
        }

        for (int b : array) {

            System.out.print(b);

        }
    }
}