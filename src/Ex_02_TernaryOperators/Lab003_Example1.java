package Ex_02_TernaryOperators;

public class Lab003_Example1 {
    public static void main (String[] args){
        int studentMarks = 69;

        String result = studentMarks > 35 ? "PASS" : "FAIL";
        System.out.println(result);
       // String result = studentMarks>35 ? (studentMarks>60 ? "Distinction" : "PASS") : ("FAIL");
    }
}
