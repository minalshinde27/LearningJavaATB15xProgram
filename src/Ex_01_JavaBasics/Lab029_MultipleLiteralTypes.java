package Ex_01_JavaBasics;

public class Lab029_MultipleLiteralTypes {
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Binary System
        // https://www.rapidtables.com/convert/number/binary-to-decimal.html?x=1010


        // Octal base? -> 8
        int octal = 0101;

        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        int binary = 0b1010;
        int hex1 = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);

        //'null' literals
        String name = null;
        String name1 = "";
        char c = '0';
        //int a = null;


    }
}
