package Ex_06_WhileLoop;

public class Lab022_WhileLoopFactorial {
    public static void main (String[] args){

        int num = 5;
        int fact = 1;

        int i = 1;
        while (i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+ " is "+fact);
    }
}
