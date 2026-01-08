package Ex_03_IncrementDecrement;

public class Lab006_Task1 {
    public static void main (String[] args){

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);          //10+11+12=33

        int a1 = 3;
        int b = a1++ * ++a1;
        System.out.println(b);          //3*5=15

        int a2 = 5;
        System.out.println(a2++ + a2--);  //5+6=11
    }
}
