package Ex_14_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab106_ArrayList {
    public static void main() {
        List al = new ArrayList();
        al.add(1);
        al.add("Test");
        al.add(true);
        al.add(1);
        al.add('@');

        /*
        Default capacity of ArrayList is 10; once it is reached
        new ArrayList with double i.e. 20 capacity gets created having copy of existing elements
         */
        System.out.println(al.size());
        System.out.println(al.contains("1"));   //false as integer 1 is element not string
        System.out.println(al.contains('@'));
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(1));  //find first occurance of element in list
        System.out.println(al.lastIndexOf(1)); //find last occurance of element in list

        //We can provide initial default capaciy as well
        List al1 =  new ArrayList(5);

    }
}
