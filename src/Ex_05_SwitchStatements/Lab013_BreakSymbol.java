package Ex_05_SwitchStatements;

import java.util.Scanner;

public class Lab013_BreakSymbol {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter itemcode");

        int itemCode = scanner.nextInt();

        switch (itemCode){
            /*case 001:
                System.out.println("Itemcode 001");
                break;
            case 002:
                System.out.println("Itemcode 002");
                break;
            default:
                System.out.println("Enter valid itemcode");
                break;
             */

            //For JDK>13
            case 001 -> System.out.println("Itemcode 001");
            case 002 -> System.out.println("Itemcode 002");
            default -> System.out.println("Enter valid Itemcode");

        }
    }
}
