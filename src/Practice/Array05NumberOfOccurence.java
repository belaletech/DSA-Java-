package Practice;
import java.util.Scanner;
import java.util.Arrays;

public class Array05NumberOfOccurence {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int ElementInArray,no,temp,count=0;
        System.out.println("Enter how many element you want in array ");
        ElementInArray=sc.nextInt();
        int arr[]=new int[ElementInArray];
        System.out.println("Enter "+ElementInArray+" Element");
        for(int i=0;i<ElementInArray;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter any number");
        no=sc.nextInt();
        for (int i=0;i<ElementInArray;i++)
        {
            if(no==arr[i])
                count++;
        }
        System.out.println("Number of Occurence of "+no+" is "+count);

    }
}
