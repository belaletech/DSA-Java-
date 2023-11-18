package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Array11IncreamentEveryElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of Element you want in Array");
        int noOfElement=sc.nextInt();
        System.out.println("Enter "+noOfElement+" Element");
        int arr[]=new int[noOfElement];
        for(int i=0;i<noOfElement;i++)
            arr[i]=sc.nextInt();
        System.out.println("Arrays before Increament = "+Arrays.toString(arr));
        System.out.println("Enter any number for Increament in Array");
        int no=sc.nextInt();
        for(int i=0;i<noOfElement;i++)
        {
            arr[i]=arr[i]+no;
            System.out.print(arr[i]+" ");
        }

    }
}
