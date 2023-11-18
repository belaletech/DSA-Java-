package Interview;
import java.util.Arrays;
import java.util.Scanner;
public class Interview05IsUnique {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want in array ");
        int numOfElement=sc.nextInt();
        System.out.println("Enter "+numOfElement+" Element one by one ");
        int intArray[]=new int[numOfElement];
        for (int i=0;i<numOfElement;i++)
            intArray[i]= sc.nextInt();
        System.out.println("Arrays \n"+Arrays.toString(intArray));
        Interview05IsUnique obj=new Interview05IsUnique();
        boolean result=obj.isUnique(intArray);
        System.out.println("Is Array elements is unique \n"+result);
    }
    // is unique
    public boolean isUnique(int intArray[])
    {
        for(int i=0;i<intArray.length;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[i]==intArray[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
