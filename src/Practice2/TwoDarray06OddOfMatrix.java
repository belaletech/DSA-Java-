package Practice2;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDarray06OddOfMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of row");
        int row=sc.nextInt();
        System.out.println("Enter number of column");
        int col=sc.nextInt();
        System.out.println("Enter "+row*col+" Element one by one");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Array\n"+Arrays.deepToString(arr));
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(arr[i][j]%2!=0)
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
}
