package Ex_02_Operators;

public class Lab003_TernaryOperator1 {
    public static void main (String[] args){

        int age = 19;
        String canAmolGotoGoa = age > 18 ? "Yes" : "No";
        System.out.println(canAmolGotoGoa);


        int studentMarks = 69;
        String result = studentMarks > 35 ? "PASS" : "FAIL";
        System.out.println(result);
       // String result = studentMarks>35 ? (studentMarks>60 ? "Distinction" : "PASS") : ("FAIL");

        int a = 10;
        boolean result1 = a > 10 ? true :false;

        int number = -5;
        String result2 = number > 0 ? "+ve" : "-ve";
        System.out.println(result2);

        int amol_age = 21;
        String result3 = amol_age > 18 ? (amol_age > 25 ? "You can drink": "You can't") : "No you can't go to GOA";

    }
}
