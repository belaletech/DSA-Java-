package Practice;
import java.util.Scanner;
import java.util.Arrays;

public class Array06DeleteSpecificElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int noOfelementInArray,value;
        System.out.println("Enter number of Element you want in array");

        noOfelementInArray=sc.nextInt();
        System.out.println("Enter "+noOfelementInArray+" Element");
        int arr[]=new int[noOfelementInArray];
        for(int i=0;i<noOfelementInArray;i++)
            arr[i]=sc.nextInt();
        System.out.println("Before deletion "+Arrays.toString(arr));
        int newArray[]=new int[noOfelementInArray];
        System.out.println("Enter array element to delete");
        value=sc.nextInt();
        for(int i=0,j=0;i<noOfelementInArray;i++)
        {
            if (value!=arr[i])
            {
                newArray[j]=arr[i];
                j++;

            }
        }
        System.out.println("After Deletion "+Arrays.toString(newArray));

    }
}
