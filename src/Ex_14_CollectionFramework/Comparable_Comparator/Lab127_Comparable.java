package Ex_14_CollectionFramework.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab127_Comparable {
    public static void main() {

        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1("Emp11", 11));
        empList.add(new Employee1("Emp02", 13));
        empList.add(new Employee1("Emp03", 12));

        //Original
        System.out.println(empList);

        //Using Comparable for id/name (based on class implementation, one at a time
        Collections.sort(empList);
        System.out.println(empList);

    }
}

class Employee1 implements Comparable<Employee1>{
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee1(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String printDetails (){
        return id+" "+name;
    }

    @Override
    public int compareTo(Employee1 o) {
     //   return this.id-o.id;
        return this.name.compareTo(o.name);
    }

    public String toString(){
        return "Employee{id = "+id+", name = "+name+"}";
    }
}
