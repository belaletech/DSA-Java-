package Practice;
import java.util.Scanner;
import java.util.Arrays;
public class Array03ArrangeInAscendingOrder1 {
        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            int no,temp;
            System.out.println("Enter no. of elements you want in array");
            no=in.nextInt();
            int ar[]=new int[no];
                System.out.println("Enter "+no+" elements");
            for(int i=0;i< no;i++)
                ar[i]=in.nextInt();
                System.out.println("Before Sorting");
            System.out.println(Arrays.toString(ar));

            for (int i = 0; i < no; i++)
            {
                for (int j = i+1; j < no; j++)
                {
                    if(ar[i]>ar[j])
                    {
                        temp = ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
                }
            }

                System.out.println("After Sorting");
            System.out.println(Arrays.toString(ar));
        }
    }