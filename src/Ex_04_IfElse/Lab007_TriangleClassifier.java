package Ex_04_IfElse;

import java.util.Scanner;

public class Lab007_TriangleClassifier {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter triangle's first side value");
        int side1 = scanner.nextInt();

        System.out.println("Enter triangle's second side value");
        int side2 = scanner.nextInt();

        System.out.println("Enter triangle's third side value");
        int side3 = scanner.nextInt();

        if (side1==side2){
            if (side1==side3){
                System.out.printf("Triangle is 'Equilateral' with sides as %d, %d, %d%n", side1, side2, side3);
            }
            else {
                System.out.printf("Triangle is 'Isosceles' with sides as %d, %d, %d%n", side1, side2, side3);
            }
        }
        else {
            if (side1==side3){
                System.out.printf("Triangle is 'Isosceles' with sides as %d, %d, %d%n", side1, side2, side3);
            }
            else {
                if (side2==side3){
                    System.out.printf("Triangle is 'Isosceles' with sides as %d, %d, %d%n", side1, side2, side3);
                }
                else {
            System.out.printf("Triangle is 'Scalene' with sides as %d, %d, %d%n", side1, side2, side3);
        }}}
    }
}
