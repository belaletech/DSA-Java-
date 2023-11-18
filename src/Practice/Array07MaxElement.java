package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array07MaxElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Element you want in array");
        int noOfElement=sc.nextInt();
        int arr[]=new int[noOfElement];
        System.out.println("Enter "+noOfElement+"Element");
        for(int i=0;i<noOfElement;i++)
            arr[i]=sc.nextInt();
        System.out.println("Arrays"+Arrays.toString(arr));
        int max=arr[0];
        for(int i=1;i<noOfElement;i++)
        {
            if(max<arr[i])
                max=arr[i];

        }
        System.out.println("Maximum value in array "+max);

    }
}
