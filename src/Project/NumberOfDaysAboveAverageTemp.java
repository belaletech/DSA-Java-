package Project;
import java.util.*;
public class NumberOfDaysAboveAverageTemp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many day's Tempreture ");
        int num=sc.nextInt();
        int temp[]=new int[num];
        int sum=0;
        for(int i=0;i<num;i++)
        {
            System.out.println("Days "+(i+1)+" 's temprature");
            temp[i]=sc.nextInt();
            sum +=temp[i];
        }
        //Count days above average temprature
        double avg=sum/num;
        int above=0;
        for(int i=0;i<num;i++)
        {
            if(temp[i]>avg)
            {
                above++;

            }
        }
        System.out.println();
        System.out.println("Average temp ="+avg);
        System.out.println(above+" days above average");
    }
}
