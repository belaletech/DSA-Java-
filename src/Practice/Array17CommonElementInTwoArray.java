package Practice;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
public class Array17CommonElementInTwoArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Element you want in both array");
        int noOfElement=sc.nextInt();
        int arr1[]=new int[noOfElement];
        System.out.println("Enter "+noOfElement+" Element of Array 1 one by one");
        for(int i=0;i<noOfElement;i++)
            arr1[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr1));
        int arr2[]=new int[noOfElement];
        System.out.println("Enter "+noOfElement+" Element of Array 2 one by one");
        for(int j=0;j<noOfElement;j++)
            arr2[j]=sc.nextInt();
        System.out.println(Arrays.toString(arr2));
        HashSet common=new HashSet();
        for(int i=0;i<noOfElement;i++)
        {
            for(int j=0;j<noOfElement;j++)
            {
                if(arr1[i]==arr2[j])
                    common.add(arr1[i]);
            }
        }
        System.out.println("common Element arr "+common);

    }
}
