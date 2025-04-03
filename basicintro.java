import java.util.Scanner;

public class basicintro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting name input
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        // Getting age input
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // **Consumes leftover newline character**

        System.out.print("Enter Your Father's Name: ");
        String fatherName = sc.nextLine();

        System.out.print("Enter Your Mother's Name: ");
        String motherName = sc.nextLine();

        // Formatted output
        System.out.printf("\nHello, %s! You are %d years old.%n", name, age);
        System.out.printf("%s is your Father's name.%n", fatherName);
        System.out.printf("%s is your Mother's name.%n", motherName);

    }
}
