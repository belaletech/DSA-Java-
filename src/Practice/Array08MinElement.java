package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Array08MinElement {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want in array ");
     int noOfElement=sc.nextInt();
     int arr[]=new int[noOfElement];
        System.out.println("Enter "+noOfElement+" Element");
     for (int i=0;i<noOfElement;i++)
         arr[i]=sc.nextInt();
        System.out.println("Arrays "+Arrays.toString(arr));
    int min=arr[0];
    for(int i=0;i<noOfElement;i++)
    {
        if(min>arr[i])
            min=arr[i];
    }
        System.out.println("minimum value in array "+min);
    }
}
