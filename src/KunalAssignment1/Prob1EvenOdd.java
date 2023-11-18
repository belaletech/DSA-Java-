
//1. Write a program to print whether a number is even or odd, also take input from the user.
package KunalAssignment1;
import java.util.Scanner;
public class Prob1EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
        if(a%2!=0)
        {
            System.out.println("Odd number");
        }
        else
        {
            System.out.println("Even");
        }
    }
}
