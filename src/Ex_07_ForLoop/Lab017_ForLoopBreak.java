package Ex_07_ForLoop;

public class Lab017_ForLoopBreak {
    public static void main (String[] args){

        /*for (int i=0; i<50; i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }
        System.out.println("End");
         */

        for (int i=0; i<50; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
