package Ex_14_CollectionFramework.List;

import java.util.Enumeration;
import java.util.Vector;

public class Lab108_Vector {
    public static void main() {

        /*
        Vector is a legacy class similar to ArrayList.
        It is thread safe unlike AL
         */
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Amit");
        System.out.println(v);
        System.out.println(v.contains("Lucky"));

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
