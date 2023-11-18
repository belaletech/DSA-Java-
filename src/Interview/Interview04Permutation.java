package Interview;
import java.util.Arrays;
import java.util.Scanner;
public class Interview04Permutation {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array 1");
       int numOfElement=sc.nextInt();
       int arr1[]=new int[numOfElement];
        System.out.println("Enter "+numOfElement+" Element one by one");
        for (int i=0;i<numOfElement;i++)
            arr1[i]= sc.nextInt();
        System.out.println(Arrays.toString(arr1));
        System.out.println("Enter number of Element you want in array 2");
       int numOfElement2=sc.nextInt();
        System.out.println("Enter "+numOfElement2+" Element one by one");
       int arr2[]=new int[numOfElement2];
       for (int i=0;i<numOfElement2;i++)
           arr2[i]= sc.nextInt();
        System.out.println(Arrays.toString(arr2));
        Interview04Permutation obj=new Interview04Permutation();
        boolean result=obj.permutation(arr1,arr2);
        System.out.println(result);

    }
    //permutation
    public boolean permutation(int arr1[],int arr2[])
    {
        if (arr1.length!=arr2.length)
        {
            return false;
        }
        int sum1=0,sum2=0,mult1=1,mult2=1;
        for(int i=0;i<arr1.length;i++)
        {
            sum1 +=arr1[i];
            sum2 +=arr2[i];
            mult1 *=arr1[i];
            mult2 *=arr2[i];
        }
        if(sum1==sum2 && mult1==mult2)
        {
            return true;
        }
        return false;
    }
}
