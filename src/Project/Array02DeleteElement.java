package Project;

import java.util.Scanner;

public class Array02DeleteElement {
    static int delete(int arr[],int n,int x)
    {
       int i;
       for( i=0;i<n;i++)
       {
           if(arr[i]==x)
           {
               break;
           }
       }
       if(i==n)
       {
           return n;
       }
       for(int j=i;j<n-1;j++)
       {
           arr[j]=arr[j+1];
       }
       return (n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter "+n+" Element");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Input Array");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the number you want to delelte from array");
        int x=sc.nextInt();
        var result=delete(arr,n,x);
        System.out.println(result);
    }
}
