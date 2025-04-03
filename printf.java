public class printf {
    public static void main(String[] args) {
        String name = "Aditya";
        int age = 22;
        float score = 85.567f;

        System.out.printf("Hello, %s! You are %d years old.%n", name, age);
        System.out.printf("Your score is %.2f%n", score);  // Prints 2 decimal places
    }
}
