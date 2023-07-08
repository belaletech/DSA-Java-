package Assignment1FlowControl;
//1. Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year that you want to find year is leap or not");
        int year=sc.nextInt();
        if((year%4==0 )||( year%400==0 && year%100!=0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }
}
