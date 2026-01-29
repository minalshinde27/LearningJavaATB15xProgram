package Ex_11_Arrays;

import java.util.Scanner;

public class Lab082_RightAlignedTriangle {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of N");
        int n = scanner.nextInt();

        for (int row=1; row<=n; row++){
            for (int space=1; space<=n-row; space++){
                System.out.print(" ");
            }
            for (int star=1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
