package Ex_14_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab112_ScannerArrayList {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        String nextValue = "Y";

        List<String> names = new ArrayList();

        while (nextValue.equalsIgnoreCase("Y")){
            System.out.println("Provide value for names");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();
            System.out.println("Do you want to add next value? Y/N");
            nextValue = scanner.next();
        }

        System.out.println("Stored names are :");
        for (String name : names){
            System.out.println(name);
        }

    }
}
