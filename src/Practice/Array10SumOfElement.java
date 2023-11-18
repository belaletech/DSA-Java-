package Practice;
import java.util.Scanner;
public class Array10SumOfElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter Number of Element you want in array");
        int NoOfElement=sc.nextInt();
        System.out.println("Enter "+NoOfElement+" Element");
        int arr[]=new int[NoOfElement];
        for(int i=0;i<NoOfElement;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<NoOfElement;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Total sum of Element of Array is "+sum);

    }
}
