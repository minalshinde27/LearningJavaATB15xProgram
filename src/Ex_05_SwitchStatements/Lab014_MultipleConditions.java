package Ex_05_SwitchStatements;

import java.util.Scanner;

public class Lab014_MultipleConditions {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter itemcode");

        int itemCode = scanner.nextInt();

        switch (itemCode) {
            case 001, 002, 005:
                System.out.println("Electronic Items");
                break;
            case 003, 004, 007:
                System.out.println("Pharma Items");
                break;
            default:
                System.out.println("Enter valid itemcode");
                break;
        }}
}
