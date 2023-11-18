package Practice2;

import java.util.Scanner;

public class TwoDimensionalArray {
    int arr[][]=null;

    //constructor
Scanner scan =new Scanner(System.in);
    public TwoDimensionalArray(int numberOfRows,int numberOfColumn)
    {
        this.arr=new int[numberOfRows][numberOfColumn];
        for (int row=0;row< arr.length;row++)
        {
            for(int col=0;col<arr[0].length;col++)
                {
//                    arr[row][col]=Integer.MIN_VALUE;
                    arr[row][col]= scan.nextInt();
                }

        }
    }
    //Inserting value in the Array
    public void insertValueInTheArray(int row,int col, int value)
    {
        try
        {
            if(arr[row][col]==Integer.MIN_VALUE)
            {
                arr[row][col]=value;
                System.out.println("The value is successfully inserted");
            }
            else {
                System.out.println("This cell is all ready occupied");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index for 2d Array");
        }
    }

}
