package Ex_09_Functions;

import java.util.Scanner;

public class Lab055_CallingAFunction1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a=");
        int a = scanner.nextInt();
        System.out.println("Enter a number b=");
        int b = scanner.nextInt();

        int sum = sum_two_numbers(a,b);
        System.out.println("Sum of the number is = "+sum);

        int multi = multi_of_two_number(a,b);
        System.out.println("Multi of the number is = "+multi);
    }

    static int sum_two_numbers(int x,int y){
        return x+y;
    }
    static int multi_of_two_number(int x, int y){
        return x*y;
    }
}
