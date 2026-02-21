package PracticePrograms;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        /*
        Write a program that takes three sides of a triangle and classifies it as
        Equilateral, Isosceles, or Scalene.
         */
        System.out.println("Start of the program...");

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter side of triangle");
            if(scanner.hasNextFloat()){
                float side1 = scanner.nextFloat();

                System.out.println("Enter side of triangle");
                if(scanner.hasNextFloat()){
                    float side2 = scanner.nextFloat();

                    System.out.println("Enter side of triangle");
                    if(scanner.hasNextFloat()){
                        float side3 = scanner.nextFloat();

                        if(side1==side2 && side2==side3){
                            System.out.printf("Triangle with sides %f, %f & %f is an Equilateral triangle", side1, side2, side3);
                        } else if(side1==side2 || side2==side3 || side3==side1){
                            System.out.printf("Triangle with sides %f, %f & %f is an Isosceles triangle", side1, side2, side3);
                        } else {
                            System.out.printf("Triangle with sides %f, %f & %f is a Scalene triangle", side1, side2, side3);
                        }
                    }
                    else {
                        System.out.println("Provide valid side for triangle");
                        scanner.next();
                    }
                }
                else {
                    System.out.println("Provide valid side for triangle");
                    scanner.next();
                }
            }
            else {
                System.out.println("Provide valid side for triangle");
                scanner.next();
            }

        System.out.println();
        System.out.println("End of Program..!");
    }
}
