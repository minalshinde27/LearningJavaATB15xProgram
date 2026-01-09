package Ex_02_Operators;

public class Lab_004_NestedTernary {
    public static void main (String[] args){

        //Student marks
        int studentMarks = 69;
        String result = studentMarks>35 ? (studentMarks>60 ? "Distinction" : "PASS") : ("FAIL");
        System.out.println(result);

        //Min-Max of 2 numbers
        int x = 10;
        int y = 20;
        int max = x > y ? x : y;
        int min = x > y ? y : x;
        System.out.println(max);
        System.out.println(min);

        //Even-Odd
        int num = 13;
        String result1 = (num%2 ==0) ? "even" : "odd";
        System.out.println(result1);

        //Age classification
        // User will give you input via the commandline.
        String age_input_string = args[0];
        System.out.println(age_input_string instanceof String);
        int age_user_input = Integer.parseInt(age_input_string); // 25

        String result2 = (age_user_input < 18) ? "Minor" : (age_user_input <=60) ? "Adult" : "Sr. Citizen";
        System.out.println(result2);


        }
}
