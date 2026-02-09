package Ex_14_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab107_PrintintArrayList {
    public static void main() {
        List list = new ArrayList();
        list.add("1"); // 0
        list.add("2"); // 1
        list.add("3");// 2
        list.add("3"); // 3
        list.add(4);
        list.add(true);

        System.out.println(list);
        System.out.println("__________________________");

        //Using 'for' loop
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("__________________________");

        //Using 'for each' loop
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println("__________________________");

        //Using 'Iterator'
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
