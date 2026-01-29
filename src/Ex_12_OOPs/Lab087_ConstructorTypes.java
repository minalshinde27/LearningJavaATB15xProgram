package Ex_12_OOPs;

public class Lab087_ConstructorTypes {
    public static void main() {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Lucy","brown");
        Cat c3 = new Cat("Mau","Golden");

        System.out.println(c1.name);
        System.out.println(c2.name+c2.clr);
        c3.running();

    }
}
    class Cat {
    String name;
    String clr;

    Cat(){
        System.out.println("Default Cat Constructor");
    }

    Cat (String catName, String clr){
        this.name = catName;
        this.clr = clr;
    }

    void running(){
        System.out.println(this.name+" is running");
    }
        }