package Practice2;
import java.util.Scanner;
public class TwoDArray03SumOfMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row=sc.nextInt();
        System.out.println("Enter number of Column");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter "+row*col+" Elements one by one");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
        System.out.println("Matrix is given Below");
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum=sum+arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Total Sum of Element of  Matrix is "+sum);
    }
}
