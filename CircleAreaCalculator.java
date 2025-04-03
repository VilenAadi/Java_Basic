import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Display a well-formatted heading
        System.out.println("=================================");
        System.out.println("       Circle Area Calculator    ");
        System.out.println("=================================\n");

        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for radius input
        System.out.print("Enter the radius of the circle: ");
        float radius = sc.nextFloat();

        // Calculate area using Math.PI for more precision
        double area = Math.PI * Math.pow(radius, 2);

        // Display the formatted result
        System.out.printf("\nThe area of the circle with radius %.2f is: %.2f\n", radius, area);

        // Close the scanner object to prevent resource leaks
        sc.close();

        // End message
        System.out.println("\n=================================");
        System.out.println("  Thank you for using the tool!  ");
        System.out.println("=================================");
    }
}
