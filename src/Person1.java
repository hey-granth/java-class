public class Person1 {
    // Private instance variables
    private String name;
    private int age;
    private String country;
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
    // Method to print person's details
    public void printDetails() {
        System.out.println("Name: " + getName());System.out.println("Age: " + getAge());
        System.out.println("Country: " + getCountry());
    }
    // Main method
    public static void main(String[] args) {
        Person1 p = new Person1();
// Set initial values
        p.setName("Granth");
        p.setAge(18);
        p.setCountry("India");
// Print original details
        System.out.println("Person Details:");
        p.printDetails();
// Update age
        p.setAge(19);
// Print updated details
        System.out.println("\nUpdated Age:");
        p.printDetails();
    }
}