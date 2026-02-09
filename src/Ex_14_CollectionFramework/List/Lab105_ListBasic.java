package Ex_14_CollectionFramework.List;

import java.util.List;

public class Lab105_ListBasic {
    public static void main() {
        List myList = List.of("Test", 1, true, "Check");
        //myList.add('y');
        //List modification is not allowed as its immutable
        System.out.println(myList);
    }
}
