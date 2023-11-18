//3. Write a program to input principal, time, and rate (P, T, R) from the user and
//        find Simple Interest.

package KunalAssignment1;
import java.util.Scanner;
public class Prob3SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal ");
        int principal=sc.nextInt();
        System.out.println("Enter Rate ");
        int r=sc.nextInt();
        System.out.println("Enter Time");
        int t=sc.nextInt();
        int si=(principal*r*t)/100;
        System.out.println("Simple Intrest is "+si);

    }
}
