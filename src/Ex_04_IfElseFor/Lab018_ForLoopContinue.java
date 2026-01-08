package Ex_04_IfElseFor;

public class Lab018_ForLoopContinue {
    public static void main (String[] args){
        for (int i=0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
