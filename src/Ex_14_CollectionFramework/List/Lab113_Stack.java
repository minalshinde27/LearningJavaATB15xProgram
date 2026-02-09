package Ex_14_CollectionFramework.List;

import java.util.Stack;

public class Lab113_Stack {
    public static void main() {

        Stack s = new Stack<>();

        s.add("One");
        s.add("Two");
        s.add("Three");
        s.add("Four");
        System.out.println(s);

        System.out.println(s.peek());   //Refers top(last) most element
        System.out.println(s);
        System.out.println(s.pop());    //Removes top(last) most element
        System.out.println(s);
        s.push("Five");             //Adds element at top(last)
        System.out.println(s);

        s.add(2, "New");
        System.out.println(s);

        s.addFirst("First");
        s.addLast("Last");
        System.out.println(s);

    }
}
