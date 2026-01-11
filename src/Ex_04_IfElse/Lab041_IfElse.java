package Ex_04_IfElse;

public class Lab041_IfElse {
    public static void main(String[] args) {
        System.out.println("Enter the age via the CLI options\n");
        int age = Integer.parseInt(args[0]);

        if (age > 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't");
        }

///    ///////

        int a = 10;
        if (a == 4) {
            System.out.println("haha");
        } else {
            System.out.println("hoho");
        }
///   ///

        int a1=10;
        if(a1==9)
            System.out.println("OK ");
            //System.out.println("MASTER");
        else System.out.println("BYE");

    }
}
