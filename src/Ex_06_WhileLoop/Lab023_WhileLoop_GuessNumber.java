package Ex_06_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab023_WhileLoop_GuessNumber {
    public static void main (String[] args){

        Random random = new Random();
        int numberToGuess = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter valid number");
        int guess;
        int attempts = 0;

        while (true){                       //Infinite loop untill condition is true
        if (!scanner.hasNextInt()){         //To skip non integer inout
            System.out.println("Invalid input! Please enter valid integer");
            scanner.nextInt();
            continue;
        }
        guess = scanner.nextInt();
        attempts++;
        if (guess>numberToGuess){
            System.out.println("Too High! Try again");
        } else if (guess<numberToGuess){
                System.out.println("Too Low! Try again");
            }
        else {
            System.out.println("Correct! You took "+attempts+" attempts");
            break;
        }
        }
    }
}
