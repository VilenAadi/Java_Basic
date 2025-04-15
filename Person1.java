import java.util.Scanner;

public class Person1 {
    String name;
    int age;

    // Parameterized constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your name: ");
        String inputName = sc.nextLine();

        System.out.print("Enter your age: ");
        int inputAge = sc.nextInt();

        // Creating object using user input
        Person user = new Person(inputName, inputAge);
        user.displayInfo();

        sc.close();
    }
}

