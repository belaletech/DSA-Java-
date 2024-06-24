package Gfg2Math;
import java.util.*;

public class Gfg10SieveOfErotosthnes {
    boolean isPrime(int n)
    {
        if(n<=0)
        {
            return false;
        }
        if(n==2||n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Gfg10SieveOfErotosthnes obj=new Gfg10SieveOfErotosthnes();
        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (obj.isPrime(i) == true)
                System.out.print(i + " ");
        }

    }
}
