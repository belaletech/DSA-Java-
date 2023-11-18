//6. Input currency in rupees and output in USD.

        package KunalAssignment1;
import java.util.Scanner;
public class Prob6CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Currency ");
        double curr=sc.nextDouble();
        double exchangeRate=0.014;
        double amoutInUSD=curr*exchangeRate;
//        System.out.println("%.2f INR is equal to %.2f USD%n",curr,amoutInUSD);
        sc.close();

    }
}
