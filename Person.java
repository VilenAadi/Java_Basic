import java.util.Scanner;

public class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        Person p1 = new Person();  // Using default constructor
        Person p2 = new Person("Alice", 30);  // Using parameterized constructor

        p1.displayInfo();  // Output: Name: Unknown, Age: 0
        p2.displayInfo();  // Output: Name: Alice, Age: 30
    }
}

