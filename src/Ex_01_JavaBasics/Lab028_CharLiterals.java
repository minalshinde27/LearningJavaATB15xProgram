package Ex_01_JavaBasics;

public class Lab028_CharLiterals {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';
        System.out.println(c2);
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod" + new_line + "Dutta");
        System.out.println("Pramod\nDutta");
        System.out.println("Pramod" + tab_line + "Dutta");
        System.out.println("Pramod" + back_space + "Dutta");
        System.out.println("Pramod" + carriage_return + "Dutta");

        System.out.println(" ----- ");

        System.out.println("Hi, This is a First line" + new_line + "This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65


        char ruppes = '₹';
        System.out.println(ruppes);


        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11 = '\u1F60';

        // char A  = "10";
        char c = 'A'; // 65
        System.out.println(c);
    }
}
