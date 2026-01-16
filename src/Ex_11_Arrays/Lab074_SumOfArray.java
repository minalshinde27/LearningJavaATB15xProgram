package Ex_11_Arrays;

public class Lab074_SumOfArray {
    public static void main(String[] args) {

        int[] marks = {56, 87, 79};
        int sum = 0;

        for(int i=0; i<marks.length; i++){
            sum = sum+marks[i];
        }
        System.out.println("Sum of Array is "+sum);
    }
}
