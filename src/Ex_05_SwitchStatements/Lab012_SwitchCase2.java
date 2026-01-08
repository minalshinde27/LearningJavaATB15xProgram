package Ex_05_SwitchStatements;

import java.util.Scanner;

public class Lab012_SwitchCase2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required browser");

        String browser = scanner.next();
        browser = browser.toLowerCase();    //To avoid case related issue

        switch (browser){
            case "chrome":
                System.out.println("Step1");
                System.out.println("Step2");
                break;

            case "edge":
                System.out.println("step11");
                System.out.println("Step12");
                break;

            case "firefox":
                System.out.println("Step22");
                System.out.println("Step23");
                break;

            default :
                System.out.println("Invalid browser");
                break;
        }
    }
}
