package Ex_14_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab110_ArrayListSorting {
    public static void main() {

        List<Integer> marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
        Collections.sort(marks);    //Sort the elements in ascending order
        System.out.println(marks);
        Collections.reverse(marks); //Arrange the current elements in reverse order NOT descending
        System.out.println(marks);
        //Below query prints the elements in descending order
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);

    }
}
