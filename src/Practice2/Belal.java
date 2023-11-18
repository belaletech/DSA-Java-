package Practice2;
import java.util.Arrays;
import java.util.Scanner;

public class Belal {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the cols:");
        int cols = sc.nextInt();
        System.out.println("Enter the value:");
        int values= sc.nextInt();
        TwoDimensionalArray sda=new TwoDimensionalArray(3,3);
        sda.insertValueInTheArray(rows,cols,values);
//        sda.insertValueInTheArray(0,1,25);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
