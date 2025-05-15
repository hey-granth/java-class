// Interface 1
interface Displayable {
    void display();
}
// Interface 2
interface Showable {
    void show();
}
// Class implementing both interfaces
class MyClass implements Displayable, Showable {
    // Implementing interface methods
    public void display() {
        System.out.println("I am in Display Method");
    }
    public void show() {
        System.out.println("I am in Show Method");
    }
    // Custom methods for sum and difference
    public void sum(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }
    public void difference(int a, int b) {
        System.out.println("Difference is " + (a - b));
    }
}
// Main classpublic
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
        obj.show();
        obj.sum(12, 10);
    // 12 + 10 = 22
        obj.difference(12, 40); // 12 - 40 = -28
    }
}