package Ex_07_ForLoop;

public class Lab008_FIZZBUZZ {
    public static void main (String[] args){

        for (int i=1; i<=100; i++){
            //System.out.println(i);
            if (i%3==0){
                if (i%5==0){
                    System.out.printf("%d is FIZZBUZZ %n",i);
                }
                else {
                System.out.printf("%d is FIZZ %n",i);
                    }
                }
            else {
                if (i%5==0){
                    System.out.printf("%d is BUZZ %n",i);
                }
                else {
                    System.out.printf("%d is NOT multiple of 3 or 5 %n",i);
                }
            }
            }
        }
    }
