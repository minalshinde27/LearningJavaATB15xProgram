package Ex_11_Arrays;

import java.util.Scanner;

public class Lab072_Arrays_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array");
        int size = scanner.nextInt();

        int[] marks = new int[size];

        for(int i=0; i<marks.length; i++){
            System.out.println("Enter number");
            marks[i] = scanner.nextInt();
        }

        for(int mark : marks){
            System.out.println(mark);
        }
    }
}
