package Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
        void abc(){
            int[] array = {1,2,3};
            try{
                System.out.println(array[7]);
            }catch (ArrayIndexOutOfBoundsException e){
                String s = null;
                System.out.println(s.length());
            }catch (NullPointerException e){
                System.out.println("NullPointer!");
            }
        }

    public static void main(String[] args) {
        Test9 t9 = new Test9();
        t9.abc();
    }

}