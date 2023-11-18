package Practice2;
import java.util.Scanner;
public class TwoDArray04MultiplicationOfMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter number of Row");
        row=sc.nextInt();
        System.out.println("Enter number of column");
        col=sc.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
        int arr3[][]=new int[row][col];
        System.out.println("Enter "+row*col+" Element of matrix 1");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr1[i][j]=sc.nextInt();
        System.out.println("Enter "+row*col+" Element of Matrix 2");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr2[i][j]=sc.nextInt();

        for(int i=0;i<row;i++)

            for(int j=0;j<col;j++)
            {
               for(int k=0;k<row;k++)
                   arr3[i][j]+=arr1[i][k]*arr2[k][j];

            }
        System.out.println("After multiplication \nMatrix is Given Below");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
