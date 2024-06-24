package GfgA1;

public class GFG13digitCountFactorial {
    public static int digitinfactorial(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n<=1)
        {
            return 1;
        }
        double digitCount=0;
        for(int i=2;i<=n;i++)
        {
            digitCount+=Math.log10(i);
        }
        return (int)Math.floor(digitCount)+1;
    }

    public static void main(String[] args) {
        System.out.println(digitinfactorial(6));
    }
}
