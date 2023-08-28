package Assignment1FlowControl;
import java.util.Scanner;

public class acce {
    int n;
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your number");
        int n=sc.nextInt();
        System.out.println(trailin(n));
    }
   public static int trailin(int n)
    {
        int count=0;
        if (n < 0)
            return -1;
            for (int i=5; n/i>=1; i *= 5)
        {
            count=count+n/i;
        }
        return count;
    }
}
