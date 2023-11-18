package Practice2;
import java.util.Scanner;
public class TwoDArray02MinInMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Row");
        int row=sc.nextInt();
        System.out.println("Enter number of Column");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter "+row*col+" Element one by one");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
        int m=arr[0][0];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                if (m > arr[i][j])
                    m = arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Min value in matrix "+m);
    }


}
