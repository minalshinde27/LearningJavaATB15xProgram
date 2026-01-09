package Ex_02_Operators;

public class Lab036_ComplexExamples {
    public static void main(String[] args) {
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b);

        int a = 10;
        boolean b1 = (10 ==11);
        System.out.println(b1);

        char a1 = 'A'; //  ASCII - 65
        char a2 = 'B'; //  ASCII - 66
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1+a2);
        System.out.println(a1-a2);
        // char are noting but int

        System.out.println('A' == 65);

        short s = 10;
        char c = 'A'; //65
        System.out.println(c + s); // 65+10


    }
}
