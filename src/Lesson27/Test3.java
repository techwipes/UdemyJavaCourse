package Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        // File - Абстрактная репрезентация пути к файлу или папке
        File f = new File("test10.txt");

        // FileInputStream предназначен для создания потока, с помощью  которого можно читать информацию из источника
        FileInputStream fis = new FileInputStream(f);
        fis.read(); // читать файл

        // FileOutputStream предназначен для создания потока, с помощью  которого можно передать информацию в файл
        FileOutputStream fos = new FileOutputStream(f);
        fos.write(100);
    }
}
