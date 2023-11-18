
//Write a program to check if an array contains a number in java
package Interview;
import java.util.Arrays;
import java.util.Scanner;
public class Inteview03SearchForValue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Inteview03SearchForValue obj=new Inteview03SearchForValue();
        System.out.println("Enter number you want in array");
        int numOfElement=sc.nextInt();
        int intArray[]=new int[numOfElement];
        System.out.println("Enter "+numOfElement+" Element One By One");
        for(int i=0;i<numOfElement;i++)
            intArray[i]=sc.nextInt();
        System.out.println(""+Arrays.toString(intArray));
        System.out.println("Enter number you want to find in array");
        int SearchElement=sc.nextInt();
        obj.linearSearch(intArray,SearchElement);

    }
    //Method to search element in array
    public void linearSearch(int [] intArray,int value)
    {
        for (int i=0;i< intArray.length;i++)
        {
            if(intArray[i]==value)
            {
                System.out.println("Value is found at the index of "+i);
                return;
            }

        }
        System.out.println(value + " is not found");

    }
}
