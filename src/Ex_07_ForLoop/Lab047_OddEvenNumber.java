package Ex_07_ForLoop;

public class Lab047_OddEvenNumber {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50

        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
            if (i % 2 != 0) {
//                System.out.println("Even => " + i);
                System.out.println("Odd => " + i);
            }
        }

    }
}
