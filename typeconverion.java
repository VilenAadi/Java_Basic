public class typeconverion {
    public static void main(String args[]){
        int a =25;
        long b =a;
//        long a =24;
//        int b=a;
        System.out.println(b);

    }
}
//conversion happens when
//1. type compatible
//2. destination type> source type
//byte->short->int->float->long->double
//lossy coversion
//type-implicit-widening all are same
//Happens automatically when converting a smaller data type to a larger one.