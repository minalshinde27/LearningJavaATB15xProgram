package Ex_04_IfElse;

import java.util.Scanner;

public class Lab042_IfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String name  = scanner.next();

        if (age > 34) {
            System.out.println("age > 34");
        } else if (age < 34) {
            System.out.println("age < 34");
        } else {
            System.out.println(" age == 34");
        }

        scanner.close();

    }
}
