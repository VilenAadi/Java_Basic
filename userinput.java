import java.util.Scanner;

public class userinput {
    public static void main(String args[]){
        System.out.println("___________________________");
        System.out.println("    Simple Calculator ");
        System.out.println("___________________________");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter The second Number: ");
        int b = sc.nextInt();
        System.out.println("***************************");
        System.out.println("    Result  ");
        System.out.println("***************************");

        int sum = a + b;
        System.out.println("➤ Addition:       " + a + " + " + b + " = " + sum);

        int multiplication = a * b;
        System.out.println("➤ Multiplication: " + a + " × " + b + " = " + multiplication);

        int difference = a - b;
        System.out.println("➤ Difference:     " + a + " - " + b + " = " + difference);
        float division = (float) a/b;
        System.out.println("➤ Division:       " + a + " ÷ " + b + " = " + division);
        System.out.println("-------------------------------------");
        System.out.println("       Thank You for Using!");
        System.out.println("*************************************");
    }
}
