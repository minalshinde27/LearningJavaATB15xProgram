package Ex_01_JavaBasics;

public class Lab051_variable_scope {
    public static void main(String args[]) {
//        int x;
//        x = 5;
//        { int y = 6;
//            System.out.print(x + " " + y);
//        }
//        System.out.println(x + " " + y);


        int i=0;
        for(i=1; i<=6;i++)
        {
            if(i%3==0)
                continue;
            System.out.print(i+",");
        }

    }
}
