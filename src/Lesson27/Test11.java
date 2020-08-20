package Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    static FileInputStream fis1;
    static FileInputStream fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test1");
            System.out.println("test1 exist");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Error with IO stream fis2");
            }
        }
            catch (FileNotFoundException e){
                System.out.println("File test1 not found");

            }catch (NullPointerException e){
                System.out.println("NullPointer");
            }

    }
}
