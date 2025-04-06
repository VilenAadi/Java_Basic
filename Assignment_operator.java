public class Assignment_operator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Initial x: " + x);

        x += 5;  // Equivalent to x = x + 5;
        System.out.println("After Addition Assignment: " + x);

        x *= 2;  // Equivalent to x = x * 2;
        System.out.println("After Multiplication Assignment: " + x);

        x /= 3;  // Equivalent to x = x / 3;
        System.out.println("After Division Assignment: " + x);
    }
}
