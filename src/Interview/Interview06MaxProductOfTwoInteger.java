package Interview;
import java.util.Arrays;
import java.util.Scanner;
public class Interview06MaxProductOfTwoInteger {
    public static void main(String[] args)
    {
        Interview06MaxProductOfTwoInteger obj=new Interview06MaxProductOfTwoInteger();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want in array");
        int numOfElement=sc.nextInt();
        int  intArray[]=new int[numOfElement];
        System.out.println("Enter "+numOfElement+" Element one by one");
        for(int i=0;i<numOfElement;i++)
            intArray[i]=sc.nextInt();
        System.out.println(Arrays.toString(intArray));
        String pairs= obj.maxProduct(intArray);
        System.out.println(pairs);
    }

    public String maxProduct(int intArray[])
    {
        int maxProduct=0;
        String pairs=null;
        for(int i = 0; i<intArray.length; i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[i]*intArray[j]>maxProduct)
                {
                    maxProduct=intArray[i]*intArray[j];
                    pairs=Integer.toString(intArray[i])+" "+Integer.toString(intArray[j]);

                }
            }
        }
        return pairs;
    }
}
