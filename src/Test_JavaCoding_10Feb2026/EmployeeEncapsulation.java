package Test_JavaCoding_10Feb2026;

public class EmployeeEncapsulation {
    public static void main() {
        Employee e = new Employee(1,"John Doe", 50000);
        System.out.println("Employee ID: "+e.getId()+
                " Employee Name: "+e.getName()+" Employee Salary: "+e.getSalary());
    }

}

class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
