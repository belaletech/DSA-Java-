package Math;

public class MathDigitInFactorial {
    public static int digitInFactorial(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        double digitCount=0;
        for(int i=2;i<=n;i++)
        {
            digitCount+=Math.log10(i);
        }
        return (int) Math.floor(digitCount)+1;
    }

    public static void main(String[] args) {
        System.out.println(digitInFactorial(5));
    }
}
