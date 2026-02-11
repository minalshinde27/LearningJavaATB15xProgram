package Ex_14_CollectionFramework.Queue;

import java.util.PriorityQueue;

public class Lab118_PriorityQueueBasic {
    public static void main() {
        // Queue -> 0.001% in Automation
        // FIFO
        PriorityQueue q = new PriorityQueue();
        q.add("Test");
        q.add("Academy");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
