public class Arithmatic_operators {
    public static void main(String args[]){
//        int a = 12;
//        int b = 18;
//        System.out.println(++a);//pre firsy change then use
//        System.out.println(a++);
//        System.out.println("Sum="+(a+b));
//        System.out.println("Difference="+(a-b));
//        System.out.println("multiplication="+(a*b));
//        System.out.println("division="+(a/b));
//        System.out.println("Remainder="+(a%b));
//        int a = 10;
//        int b = ++a;//pre increment
        int a = 10;
        int b = a++;//post increment  Increments after using the value.
        System.out.println(a);
        System.out.println(b);
        int x = 5;
        System.out.println(++x); // Output: 6 (increment first)
        System.out.println(x++); // Output: 6 (use first, then increment)
        System.out.println(x);   // Output: 7
    }
}

