package Ex_11_Arrays;

public class Lab070_ArraysDifferentDatatypes {
    public static void main(String[] args) {

        int[] marks = {76, 98, 78, 80, 79};
        System.out.println(marks[3]);

        int numbers[] = new int[5];
        System.out.println(numbers[2]); //Default value of int is 0

        boolean[] is_available = {true, false, false, true};

        float[] values = new float[3];
        values[0] = 3.14f;
        //values[1] = 9.43f;
        values[2] = 6.5F;
        //values[3] = 8.8f;  //It will throw 'ArrayIndexOutOfBoundsException' as size is not matching

        System.out.println(values[1]);  //Default value 0.0

        String[] names = {"Test", "Maya", "Adi"};

        String str[] = new String[5];
        System.out.println(str[1]);     //Default value of String is null

    }
}
