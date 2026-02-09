package Ex_14_CollectionFramework.List;

import java.util.LinkedList;
import java.util.List;

public class Lab111_LinkedListBasic {
    public static void main() {

        List mylist = new LinkedList<>();
         mylist.add(1);
         mylist.add(2);
         mylist.add(3);
         mylist.add(4);
        System.out.println(mylist);

        mylist.addFirst("First");   //Adds element at start
        mylist.addLast("Last");     //Adds element at last
        System.out.println(mylist);

        System.out.println(mylist.get(3));
        System.out.println(mylist.isEmpty());
        System.out.println(mylist.size());
        System.out.println(mylist.contains(4));

        mylist.remove("First");
        System.out.println(mylist);
        mylist.remove(2);
        System.out.println(mylist);
        mylist.removeLast();
        System.out.println(mylist);
    }
}
