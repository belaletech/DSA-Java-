package Bitmap;
import java.util.Scanner;
public class Bit01And {
    public static void andOperator(int a,int b)
    {
//        int c=a&b;
//        System.out.println("And Operator"+c);
//        int d=a|b;
//        System.out.println("Or Operator "+d);
//        int e=a^b;
//        System.out.println("x-or Operator"+e);
        int f=~a;
        System.out.println(f);
    }
    public static void main(String[] args) {

        andOperator(2,3);
    }
}
