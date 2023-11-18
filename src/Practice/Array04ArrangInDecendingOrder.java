package Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Array04ArrangInDecendingOrder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no,temp;
        System.out.println("Enter number of element you want in aray");
        no=sc.nextInt();
        int arr[]=new int[no];
        System.out.println("Enter "+no+" Element");
        for(int i=0;i<no;i++)
            arr[i]=sc.nextInt();
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<no;i++)
        {
            for(int j=i+1;j<no;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
