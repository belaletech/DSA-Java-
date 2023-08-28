package Assignment1FlowControl;
import java.util.Scanner;
public class SumOfAll {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;

        while (true)
        {

            System.out.println("Enter number(-1 to exit:)");
            int n=sc.nextInt();
            if(n== -1)
            {
                break;
            }
            else {
                sum +=n;
            }
        }
        System.out.println("sum="+ sum);
    }
}
