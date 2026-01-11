package Test_JavaCoding_11Jan2026;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        if (scanner.hasNextInt()){
            int num = scanner.nextInt();

            if (num>0){
                System.out.println(num+" is Positive Number");
            } else if (num<0){
                System.out.println(num+" is Negative Number");
            } else {
                System.out.println(num+" is 0");
            }
        }
        else {
            System.out.println("Enter valid integer");
            System.exit(0);
        }
    }
}
