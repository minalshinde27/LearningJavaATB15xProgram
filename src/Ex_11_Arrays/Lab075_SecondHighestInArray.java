package Ex_11_Arrays;

import java.util.Arrays;

public class Lab075_SecondHighestInArray {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        //Using built in method
//        Arrays.sort(numbers);
//        System.out.println(numbers[numbers.length-2]);

        //Without built in method
        int max = 0;
        int second_max = 0;

        for (int i=0; i<numbers.length; i++){
        if (numbers[i] > max) {
            second_max = max;
            max = numbers[i];
        } else if (numbers[i] > second_max && numbers[i] != max){
                second_max = numbers[i];
            }
        }
        System.out.println("Second max number is "+second_max);

    }
}
