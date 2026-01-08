package Ex_04_IfElseFor;

public class Lab019_ForContinueEvenNumbers {
    public static void main (String[] args){
        for (int i=0; i<=50; i++){
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
