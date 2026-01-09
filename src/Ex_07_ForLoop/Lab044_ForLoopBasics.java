package Ex_07_ForLoop;

public class Lab044_ForLoopBasics {
    public static void main (String[] args){

        //    for(I;C;U){
        // this is the code that you want to execute multiple times }

        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        // with float
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }

        //with initialization outside loop
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
