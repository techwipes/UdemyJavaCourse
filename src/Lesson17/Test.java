package Lesson17;

public class Test {
    public static void main(String[] args) {


        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array2 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array3 = array2;
        System.out.println(array3==array2);
        System.out.println(array1.equals(array2));

    }


}
