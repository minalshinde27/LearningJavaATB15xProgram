package Test_JavaCoding_10Feb2026;

public class StudentManagementSystem {
    public static void main() {
        Student s = new Student("Bob", 101, 'A');
        s.display();
    }
}

class Student {
    String name;
    int rollNo;
    char section;

    public Student(String name, int rollNo, char section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void display(){
        System.out.println("Student: "+this.name+", Roll No: "+this.rollNo+
                ", Section: "+this.section);
    }
}
