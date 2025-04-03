import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("        Simple Calculator");
        System.out.println("*************************************");

        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();

        System.out.println("\n-------------------------------------");
        System.out.println("            Results");
        System.out.println("-------------------------------------");

        int sum = a + b;
        System.out.println("➤ Addition:       " + a + " + " + b + " = " + sum);

        int multiplication = a * b;
        System.out.println("➤ Multiplication: " + a + " × " + b + " = " + multiplication);

        int difference = a - b;
        System.out.println("➤ Difference:     " + a + " - " + b + " = " + difference);

        if (b != 0) {
            float division = (float) a / b;
            System.out.println("➤ Division:       " + a + " ÷ " + b + " = " + division);
        } else {
            System.out.println("➤ Division:       Cannot divide by zero!");
        }

        System.out.println("-------------------------------------");
        System.out.println("       Thank You for Using!");
        System.out.println("*************************************");


    }
}
