package Test_JavaCoding_10Feb2026;

public class PersonClassImplementation {
    public static void main() {
        Person p1 = new Person("John", 25);
        p1.display();

        Person p2 = new Person("Alice", 30);
        p2.display();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.print("Name: "+this.name+", Age: "+this.age+" ");
    }
}
