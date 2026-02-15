package Ex_14_CollectionFramework.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab126_Comparator {
    public static void main() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2,"Emp2",2000));
        employeeList.add(new Employee(3,"Emp3",3000));
        employeeList.add(new Employee(1,"Emp1",1000));

        System.out.println(employeeList);
        Comparator<Employee> idComparator = (e1, e2) -> e1.id - e2.id;
        Collections.sort(employeeList,idComparator);
        System.out.println(employeeList);
    }
}

class Employee {
    Integer id;
    String name;
    Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee{"+ "id:" + id + " name:" + name + " Salary:" + salary + "}";
    }
}