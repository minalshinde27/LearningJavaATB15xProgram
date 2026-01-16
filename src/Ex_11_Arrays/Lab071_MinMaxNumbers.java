package Ex_11_Arrays;

import java.util.Arrays;

public class Lab071_MinMaxNumbers {
    public static void main(String[] args) {

        int[] marks = {25, 14, 56, 34, 87, 67, 98, 78, 84};

        //Using built in methods
        Arrays.sort(marks);
        System.out.println(marks[marks.length-1]);  //For max number
        System.out.println(marks[0]);    //For min number

        System.out.println("===========");


        //Without built in methods
        int max = marks[0];
        int min = marks[0];

        for (int i=0; i<marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("Max no. is "+max);

        for (int i=0; i<marks.length; i++){
            if(marks[i] < min){
                min = marks[i];
            }
        }
        System.out.println("Min no. is "+min);
    }
}
