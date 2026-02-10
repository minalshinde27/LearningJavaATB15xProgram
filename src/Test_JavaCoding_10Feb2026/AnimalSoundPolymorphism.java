package Test_JavaCoding_10Feb2026;

public class AnimalSoundPolymorphism {
    public static void main() {
        Animal a1 = new Dog();
        a1.makeSound();
        Animal a2 = new Cat();
        a2.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.print("Animal Sound");
    }
}

class Dog extends Animal {
    public void makeSound(){
        System.out.print("Dog says: Woof! Woof! ");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.print("Cat says: Meow! Meow! ");
    }
}
