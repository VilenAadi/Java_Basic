import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        System.out.println("***************************");
        System.out.println("    Area of Circle  ");
        System.out.println("***************************");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        float rad = sc.nextFloat();
        float area = (float)3.14*rad*rad;
        System.out.printf("\nThe area of the circle with radius %.2f is: %.6f\n", rad, area);

        System.out.println("\n=================================");
        System.out.println("  Thank you for using the tool!  ");
        System.out.println("=================================");

    }
}
