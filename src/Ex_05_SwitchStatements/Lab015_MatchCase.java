package Ex_05_SwitchStatements;

public class Lab015_MatchCase {
    public static void main (String[] args){

        int a =15;

        switch (-1){
            case 3:
                System.out.println("111");
                break;
            case -1:
                System.out.println("222");
                break;
            case 10:
                System.out.println("333");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
