package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {
      File f = new File("test.txt");


        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Check");
        }catch (FileNotFoundException e){
            System.out.println("File not found!!");
        }catch (NullPointerException e){
            System.out.println("Null!");
        }
        finally {
            System.out.println("End of test");
        }
        System.out.println("Out of exceptions");
    }
}
