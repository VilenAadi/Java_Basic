public class Logical_operator {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 8;

        System.out.println("Logical AND: " + (a > b && c > b)); // true
        System.out.println("Logical OR: " + (a < b || c > b));  // true
        System.out.println("Logical NOT: " + !(a > c));         // false
    }
}
