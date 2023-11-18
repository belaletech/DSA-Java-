package BasicString;
import java.util.Scanner;
public class String04ReverseOrder {
    public static void main(String[] args) {
        String str;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        str=sc.nextLine();
        //passing String into String array
        String word[]=str.split("\\s");
        for(int i= word.length-1;i>=0;i--)
        {
            System.out.print(word[i]+" ");
        }
    }
}
