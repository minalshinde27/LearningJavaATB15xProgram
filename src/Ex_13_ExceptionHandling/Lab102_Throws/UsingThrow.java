package Ex_13_ExceptionHandling.Lab102_Throws;

import java.util.Scanner;

public class UsingThrow {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scanner.nextInt();

        try {
            ageAnalysis(age);
        } catch (Exception e) {
            System.out.println("You are a Minor");
        }
    }

    static void ageAnalysis(int age) throws Exception {
        if (age<18){
            throw new Exception("You are a Minor");
        }
    }
}
