package Ex_11_Arrays;

public class Lab069_ArraysBasics {
    public static void main (String[] args){

        //Creating array with '=' operator with direct values
        int[] marks = {56, 76, 67, 98, 84};
        int marks1[] = {79, 94, 76, 70, 89};

        System.out.println(marks.length);

        for(int i=0; i<marks1.length; i++){
            System.out.println(marks1[i]);
        }

        System.out.println("============");

        //Creating array with 'new' operator
        int[] marks2 = new int[4];
        marks2[0] = 89;
        marks2[1] = 79;
        marks2[2] = 85;
        marks2[3] = 93;

        for (int mark : marks2){
            System.out.println(mark);
        }

    }
}
