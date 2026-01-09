package Ex_02_Operators;

public class Lab_005_TernaryOperatorTask1_MaxOfThree {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        String result = n1>n2 ? (n1>n3 ? "n1 is MAX number" : "n3 is MAX number") :
                (n2>n3 ? "n2 is MAX number" : "n3 is MAX number");

        System.out.println(result);

        int max = (n1>n2)? ((n1>n3) ? n1 : n3) : ((n2>n3) ? n2 : n3);
        System.out.println("MAX number out of three is "+max);
    }
}
