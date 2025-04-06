public class Type_Casting {
    public static void main(String args[]){
//        float a= 34.99656f;
//        int b = (int) a;
//        System.out.println(b);//34 output loss of data happens
        char ch = 'd';
        int num = ch;
        System.out.println(num);//100 this happens using ASCII value
    }
}
//loss of data happens in this conversion

