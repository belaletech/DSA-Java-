package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array16Average {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Element you want in array");
        int noOfElement=sc.nextInt();
        System.out.println("Enter "+noOfElement+" Element");
        int arr[]=new int[noOfElement];
        for (int i=0;i<noOfElement;i++)
            arr[i]=sc.nextInt();
        System.out.println(" Array "+Arrays.toString(arr));
        int sum=0;
        for(int i=0;i<noOfElement;i++)
        {
            sum=sum+arr[i];
        }
        float avg=sum/noOfElement;
        System.out.println("Average of array is "+avg);
    }
}
