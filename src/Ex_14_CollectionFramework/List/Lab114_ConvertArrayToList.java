package Ex_14_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab114_ConvertArrayToList {
    public static void main() {

        String[] arr = {"Java", "Python", "C#"};

        List list1 = Arrays.asList(arr);
        System.out.println(list1);
    }
}
