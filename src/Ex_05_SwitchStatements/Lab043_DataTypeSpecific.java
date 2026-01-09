package Ex_05_SwitchStatements;

public class Lab043_DataTypeSpecific {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }


        long a11 = 30l;
        switch ((int) a11) {
            case 1:
                System.out.println("For float");
                break;
            default:
                System.out.println("No Match");
                break;
        }

    }
}
