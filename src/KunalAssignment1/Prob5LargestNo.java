//5. Take 2 numbers as input and print the largest number.

        package KunalAssignment1;

import java.util.Scanner;

public class Prob5LargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b= sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is largest");
        }
        else System.out.println(b+" is largest ");

    }
}
