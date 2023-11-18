package Practice;

import java.util.Scanner;

public class array19RemoveDuplicateSortedArray {
    public int removeDuplicate(int [] num)
    {
        if(num.length==0){
            return 0;
        }
        int i=0;
        for(int j=1;j< num.length;j++)
        {
            if(num[j]!=num[i])
            {
                i++;
                num[i]=num[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        array19RemoveDuplicateSortedArray obj=new array19RemoveDuplicateSortedArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array");
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++)
            num[i]=sc.nextInt();
        var result=obj.removeDuplicate(num);
        System.out.println(result);
    }
}
