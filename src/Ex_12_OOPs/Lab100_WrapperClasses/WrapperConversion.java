package Ex_12_OOPs.Lab100_WrapperClasses;

public class WrapperConversion {
    public static void main() {

        String num = "10";
        int a = 10;

        /*String to Wrapper
            Integer.parseInt()
            Double.parseDouble()
            Float.parseFloat()
            Long.parseLong()
         */
        Integer aa = Integer.parseInt(num);
        System.out.println(aa);
        Integer aa1 = Integer.valueOf(num);
        System.out.println(aa1);

        //Strint to Primitive
        int a1 = Integer.parseInt(num);

        //Wrapper to String
        Integer x = 10;
        System.out.println(x.toString());
        System.out.println(x.toString() instanceof String);

    }
}
