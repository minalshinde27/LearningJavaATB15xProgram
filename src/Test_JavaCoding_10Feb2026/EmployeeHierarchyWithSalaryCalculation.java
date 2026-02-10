package Test_JavaCoding_10Feb2026;

public class EmployeeHierarchyWithSalaryCalculation {
    public static void main() {
        Employee1 e1 = new Manager();
        e1.salCalculation(60000, 10000);
        Employee1 e2 = new Developer();
        e2.salCalculation(50, 160);
    }
}

class Employee1 {
    double sal;
    int baseSal;
    int bonus;
    int hourlyRate;
    int hours;

    public void salCalculation(int baseSal, double bonus) {
        System.out.print("Employee Salary ");
    }

    public void salCalculation(int hourlyRate, int hours) {
        System.out.print ("Employee Salary ");
    }
}

class Manager extends Employee1 {
    public void salCalculation(int baseSal, int bonus) {
        this.sal = baseSal+bonus;
        System.out.print("Manager Salary: "+this.sal+" ");
    }
}

class Developer extends Employee1 {
    public void salCalculation(int hourlyRate, int hours) {
        this.sal = hourlyRate*hours;
        System.out.print("Developer Salary: "+this.sal+" ");    }
}