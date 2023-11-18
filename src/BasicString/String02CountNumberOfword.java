package BasicString;
import java.util.Scanner;
public class String02CountNumberOfword {
    public static void main(String[] args) {
        String str;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        str=sc.nextLine();
        //convert String into string array
        String word[]=str.split("\\s");
        for(int i=0;i< word.length;i++)
        {
            count ++;
        }
        System.out.println("Total word in sentence "+count);
    }
}
