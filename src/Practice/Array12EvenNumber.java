package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array12EvenNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Element you want in array ");
        int noOfElement=sc.nextInt();
        System.out.println("Enter "+noOfElement+" Element");
        int arr[]=new int[noOfElement];
        for(int i=0;i<noOfElement;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array = "+Arrays.toString(arr));
        for(int i=0;i<noOfElement;i++)
        {
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
    }
}
