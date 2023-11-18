package Assignment01;
import java.util.Scanner;
public class Assignment03HCF {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);


        Assignment03HCF as3 = new Assignment03HCF();
        int result=as3.hcf(max,min);
        System.out.println("HCF of two number is "+result);

    }
    public int hcf(int a,int b){

        if(a==0) {
            return b;
        }
        if (b==0)
        {
            return a;
        }
      return hcf(b,a%b);
    }
}
