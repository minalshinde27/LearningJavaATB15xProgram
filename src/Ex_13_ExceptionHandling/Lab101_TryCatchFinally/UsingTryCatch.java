package Ex_13_ExceptionHandling.Lab101_TryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingTryCatch {
    public static void main() {
        System.out.println("Start of Program");
        int a = 10;

        try {
            FileInputStream fis = new FileInputStream("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program");
    }
}