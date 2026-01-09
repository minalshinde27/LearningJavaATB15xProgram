package Ex_03_IncrementDecrement;

public class Lab039_PostIncreDecre {
    public static void main(String[] args) {

        // POST increment  = Print first and then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 11 |  10 | NA
        // 12 |  11   |  10

    }
}
