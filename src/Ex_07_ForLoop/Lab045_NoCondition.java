package Ex_07_ForLoop;

public class Lab045_NoCondition {
    public static void main (String[] args){
        // When no condition is specific code keeps on executing
        for (int i = 0; ; i++) {
            System.out.println(i);
            // exit code 130 , (Need to Stop by Yourself- Kill) Red Button - interrupted by signal
        }
    }
}
