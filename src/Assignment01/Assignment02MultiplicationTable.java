package Assignment01;
import java.util.Scanner;
public class Assignment02MultiplicationTable {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want to print table");
        int table=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(table+"*"+i+"="+table*i);
        }
    }
}
