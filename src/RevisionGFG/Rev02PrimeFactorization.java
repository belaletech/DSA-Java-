package RevisionGFG;

public class Rev02PrimeFactorization {
    public static void main(String[] args) {
        primeFactor(32);
    }

    public static void primeFactor(int n)
    {
        Rev01PrimeNo obj=new Rev01PrimeNo();

        for(int i=2;i<n;i++)
        {
            if(obj.isPrime(i))
            {
                int x=i;
                while (n%x==0)
                {
                    System.out.println(i);
                    x=x*i;
                }
            }
        }
    }
}
