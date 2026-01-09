package Ex_07_ForLoop;

import java.util.Scanner;

public class Lab020_FactorialProgram {
    public static void main(String[] args) {
            System.out.println("Factorial Program");
            Scanner scanner = new Scanner(System.in);
            System.out.println ("Enter positive integer number");

            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                int fact = 1;

                for (int i=1; i<=number; i++){
                    fact = fact*i;
                }
                System.out.printf ("Factorial of %d is %d", number, fact);
            }
            else {
                System.out.println ("Enter valid positive integer");
            }
        }
    }

