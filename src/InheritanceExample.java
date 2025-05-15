// Base class
class Animal {
    void eat(String name) {
        System.out.println(name + " is eating.");
    }
    void sleep(String name) {
        System.out.println(name + " is sleeping.");
    }
}
// Single Inheritance: Dog inherits Animal
class Dog extends Animal {
    void bark(String name) {
        System.out.println(name + " is barking.");
    }
}
// Multilevel Inheritance: Puppy inherits Dog which inherits Animal
class Puppy extends Dog {
    void weep(String name) {
        System.out.println(name + " is weeping.");
    }
}
// Main class
public class InheritanceExample {
    public static void main(String[] args) {System.out.println("Single Inheritance Example:");
        Dog buddy = new Dog();
        buddy.eat("Buddy");
        buddy.sleep("Buddy");
        buddy.bark("Buddy");
        System.out.println("\nMultilevel Inheritance Example:");
        Puppy tommy = new Puppy();
        tommy.eat("Tommy");
        tommy.sleep("Tommy");
        tommy.bark("Tommy");
        tommy.weep("Tommy");
    }
}