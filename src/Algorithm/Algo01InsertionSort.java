package Algorithm;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Algo01InsertionSort {
    public static void main(String [] args)
    {
//        Algo01InsertionSort obj=new Algo01InsertionSort();
        Scanner sc=new Scanner(System.in);
        int arraySize = sc.nextInt();
        int A[]=new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

            A[i] =new Random().nextInt(arraySize);
        }
        System.out.println("Original Arrays"+Arrays.toString(A));

        insertionSort(A);
        System.out.println(Arrays.toString(A));

    }
   public static void insertionSort(int A[])
   {
       for (int j=1;j< A.length;j++)
       {
           int key=A[j];
           int i=j-1;
           while (i>=0 && A[i]>key) {
               A[i + 1] = A[i];
               i = i - 1;
           }
           A[i+1]=key;
       }
   }
}
