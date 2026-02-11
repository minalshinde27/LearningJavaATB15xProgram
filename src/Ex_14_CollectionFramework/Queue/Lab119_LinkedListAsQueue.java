package Ex_14_CollectionFramework.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab119_LinkedListAsQueue {
    public static void main() {
        Queue<Integer> llq = new LinkedList<>();
        llq.add(6);
        llq.add(4);
        llq.add(9);
        System.out.println(llq);

        System.out.println("-----------");

        Iterator<Integer> iterator = llq.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
