package BasicString;
import java.util.Scanner;
public class String01CountToatalNoOfSpace {
    public static void main(String[] args) {
        String str;
        int space=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                space++;
            }
        }
        System.out.println("Total number of space "+space);
    }


}
