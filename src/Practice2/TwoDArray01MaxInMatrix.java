package Practice2;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray01MaxInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, sum;
        System.out.println("Enter Number of Rows");
        row = sc.nextInt();
        System.out.println("Enter Number of Column");
        col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter Elements one by one ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();
        int m=arr[0][0];
        System.out.println("Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
            {

                System.out.print(arr[i][j] + " ");
                if (m<arr[i][j])
                    m=arr[i][j];
            }

            System.out.println();
        }
        System.out.println("maximum value in matrxi "+m);


    }
}
