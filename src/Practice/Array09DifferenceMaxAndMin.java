package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array09DifferenceMaxAndMin {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of element you want in array");
        int NoOfElementInArray=sc.nextInt();
        int arr[]=new int[NoOfElementInArray];
        System.out.println("Enter "+NoOfElementInArray+" Element");
        for (int i=0;i<NoOfElementInArray;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array : "+ Arrays.toString(arr));

        int max=arr[0],min=arr[0];
        for(int i=0;i<NoOfElementInArray;i++)
        {
            if(max<arr[i])
                max=arr[i];
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Maximum Element of array "+max+ "\n"+"Minimum Element of Array "+min);

        System.out.println("Difference of maximum and minimum "+(max-min));
    }

}
