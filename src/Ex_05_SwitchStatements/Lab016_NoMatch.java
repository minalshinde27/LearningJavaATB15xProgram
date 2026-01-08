package Ex_05_SwitchStatements;

public class Lab016_NoMatch {
    public static void main (String[] args) {

        char code = 'M';

        switch (code) {
            case 3:
                System.out.println("111");
                break;
            case 'a':
                System.out.println("222");
                break;
            case 10:
                System.out.println("333");
                break;
            default:
                System.out.println("default");
                break;
        }
    }}