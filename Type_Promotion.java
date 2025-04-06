public class Type_Promotion {
    public static void main(String args[]){
//        byte a = 10;
//        byte b = 20;
//        char e = 'd';
//        byte c = (byte) (a + b+ e);  // (a + b) automatically promoted to int
//          int a=24;
//          float pi =22.7f;
//          double e = 34.56677;
//          double c = a+pi+e;
//        System.out.println("Result: " + c);
        byte b = 5;
        byte a = (byte)(b*2);
        System.out.println(a);

    }

}

//Type promotion in Java refers to the automatic conversion of smaller data types into larger data types when performing operations. This ensures that there is no loss of precision and avoids type mismatches.
//How Type Promotion Works
//When an operation involves multiple data types, Java automatically promotes smaller types to a larger one to match the most precise type in the expression. Here’s the order of promotion:
//
