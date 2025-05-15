public class Person {
    // Attributes (instance variables)
    String name;
    int age;
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display person's details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    // Main method to create and use Person objects
    public static void main(String[] args) {
// Creating two Person objects using constructor
        Person person1 = new Person("Divyan", 16);
        Person person2 = new Person("Granth", 19);
// Displaying their information
        person1.displayInfo();
        person2.displayInfo();
    }
}