package Ex_11_Arrays;

import java.util.Scanner;

public class Lab081_RightTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N");
        int n = scanner.nextInt();

        for(int row=0; row<n; row++){
            for (int star=0; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
