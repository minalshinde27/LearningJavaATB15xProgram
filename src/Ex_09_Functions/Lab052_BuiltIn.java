package Ex_09_Functions;

public class Lab052_BuiltIn {
    public static void main (String[] args){
        int max = Math.max(6, 9);
        System.out.println(max);

        double min = Math.min(2.4, 5.1);
        System.out.println(min);

        char[] c1 = {'A','2','@'};
        String str1 = String.copyValueOf(c1);
        System.out.println(str1);
    }
}
