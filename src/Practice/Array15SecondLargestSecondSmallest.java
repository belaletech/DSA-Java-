package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array15SecondLargestSecondSmallest {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("Enter Number of Element you want in array");
        int noOfElement=sc.nextInt();
        System.out.println("Enter "+noOfElement+" Element One by one");
        int arr[]=new int[noOfElement];
        for(int i=0;i<noOfElement;i++)
            arr[i]=sc.nextInt();
        System.out.println("Arrays"+Arrays.toString(arr));
        for(int i=0;i<noOfElement;i++)
        {
            for(int j=i+1;j<noOfElement;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest number = "+arr[noOfElement-2]);
        System.out.println("Second smallest number = "+arr[1]);
    }
}
