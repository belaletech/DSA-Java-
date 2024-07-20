package RevisionGFG;

public class Rev01PrimeNo {
//    protected boolean isPrime;

    public static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2 || n==3)
        {
            return true;
        }
        if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 ||n%(i+2)==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(15));
    }
}
