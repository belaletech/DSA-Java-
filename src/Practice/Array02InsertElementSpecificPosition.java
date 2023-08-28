package Practice;
import java.util.Scanner;
import java.util.Arrays;

public class Array02InsertElementSpecificPosition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,15,2,34,16,25,26};
        int newArr[]=new int[7];
        int index,value;
        System.out.println("Enter index");
        index=sc.nextInt();
        System.out.println("Enter Value");
        value=sc.nextInt();
        System.out.println("Before Insertion array is"+Arrays.toString(arr));
        for(int i=0,j=0;i<newArr.length;i++)
        {
            if(index!=i)
            {
                newArr[i]=arr[j];
                j++;
            }
            else
            {
                newArr[i]=value;
            }
            System.out.println("After Insertion "+ Arrays.toString(newArr));
        }
    }
}
