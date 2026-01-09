package Ex_06_WhileLoop;

public class Lab021_WhileLoopBasics {
    public static void main (String[] args){

        int i = 0; // Init
        while (i < 5) {//condition
            System.out.println(i);
            i++; // Updation
        }

        // Similarity with 'For' loop : I, C, U
        for (int j = 0; j < 3 ; j++) {
            System.out.println(j);
        }

        // No execution of code as condition is not met
        int j = 0;
        while (j > 0) {
            System.out.println("Enter");
            System.out.println(j);
            j++;
        }


        //Reverse order printing
        int i1 = 10;
        while (i1>=1){
            System.out.println(i1);
            i1--;
        }

    }
}
