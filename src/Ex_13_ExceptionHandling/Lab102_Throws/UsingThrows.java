package Ex_13_ExceptionHandling.Lab102_Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {
    public static void main() {

        System.out.println("Starting program");
        try {
            fileRead();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program executed");

    }

    static void fileRead () throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C://abc.txt");
    }
}

