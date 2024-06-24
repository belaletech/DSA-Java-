package ArrayQuestion;

import java.util.Scanner;

public class Array01PrefixSum1 {

    static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int [] makePrefixSumArray(int arr[])
    {
        int n=arr.length;
        int pref[]=new int[n];
        for(int i=0;i<n;i++)
        {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" Element one by one");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array ");
       printArray(arr);
        int pref[]=makePrefixSumArray(arr);
        printArray(pref);
    }
}
