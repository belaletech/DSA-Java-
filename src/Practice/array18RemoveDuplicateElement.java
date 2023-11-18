package Practice;
import java.util.Arrays;
import java.util.Scanner;

public class array18RemoveDuplicateElement {
    public static int[] removeDuplicates(int [] arr)
    {
        int n= arr.length;
       int [] uniqueArray=new int[n];
       int index=0;
       for(int i=0;i<n;i++)
       {
           boolean isDuplicate=false;
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]==arr[j])
               {
                   isDuplicate=true;
                   break;
               }
           }
           if(!isDuplicate)
           {
               uniqueArray[index++]=arr[i];
           }

       }
       return Arrays.copyOf(uniqueArray,index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" element one by one");
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is given below\n"+Arrays.toString(arr));
        array18RemoveDuplicateElement obj=new array18RemoveDuplicateElement();
        var result=Arrays.toString(removeDuplicates(arr));
        System.out.println(result);


    }
}
