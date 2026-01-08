package Ex_02_TernaryOperators;

public class Lab_004_NestedTernary {
    public static void main (String[] args){
        int studentMarks = 69;

        String result = studentMarks>35 ? (studentMarks>60 ? "Distinction" : "PASS") : ("FAIL");
        System.out.println(result);
        }
}
