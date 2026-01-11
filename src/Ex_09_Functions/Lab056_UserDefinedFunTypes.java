package Ex_09_Functions;

public class Lab056_UserDefinedFunTypes {
    public static void main(String[] args) {

        wop_wor_greet();

        String msg = wop_wr_greet_2();

        greet_with_details("Pramod", 65, 100);

        int sum = sum_of_two_numbers(3, 4);

    }

    // 1.Without Argument / Parameters and Without Return Type.
    static void wop_wor_greet() {
        System.out.println("No return no parameters");
    }

    //  2. Without Parameters but With Return Type
    static String wop_wr_greet_2() {
        return "Returning String";
    }

    //  3. With Parameters and Without Return Type ( 90%)
    static void greet_with_details(String pramod, int i, int i1) {
        System.out.println("No return with parameters");
    }

    //  4. With Parameters and With Return Type
    static int sum_of_two_numbers(int i, int i1) {
        return i + i1;
    }

}
