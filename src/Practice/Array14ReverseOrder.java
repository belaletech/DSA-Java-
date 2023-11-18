package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array14ReverseOrder {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want in Array ");
        int noOfElementInArray=sc.nextInt();
        System.out.println("Enter "+noOfElementInArray+" Element");
        int arr[]=new int[noOfElementInArray];
        for (int i=0;i<noOfElementInArray;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array "+Arrays.toString(arr));
        System.out.println("Reverse Order");
        for(int i=noOfElementInArray-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
