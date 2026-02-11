package Ex_14_CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab120_ArrayDeque {
    public static void main() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(5);
        dq.add(1);
        System.out.println(dq);
    }
}
