package Ex_08_DoWhile;

public class Lab050_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
        while (a < 0) {
            System.out.println("While executed");
            a++;
        }

        do{
            System.out.println("DoWhileExecuted");
            a++;

        }while (a<0);
    }
}
