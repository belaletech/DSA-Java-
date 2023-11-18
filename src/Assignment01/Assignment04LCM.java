package Assignment01;
import java.util.Scanner;
public class Assignment04LCM {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();


        Assignment04LCM as3 = new Assignment04LCM();
        int result=calculateLCM(a,b);
        System.out.println("LCM of two number is "+result);

    }
    public static int calculateLCM(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            int multiple = max * i;
            if (multiple % min == 0) {
                return multiple;
            }
        }

        return a * b; // In case no common multiple is found
    }
}
