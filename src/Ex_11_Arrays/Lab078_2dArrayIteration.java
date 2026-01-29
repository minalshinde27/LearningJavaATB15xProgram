package Ex_11_Arrays;

public class Lab078_2dArrayIteration {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length ; i++) {      //array.length gives no of rows
            for (int j = 0; j < matrix[i].length ; j++) {   //array[i].length gives no. of columns for i'th row
                System.out.print(matrix[i][j] +"|");
            }
            System.out.println("");
        }
    }
}
