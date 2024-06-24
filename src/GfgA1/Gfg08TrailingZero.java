package GfgA1;

public class Gfg08TrailingZero {
    int countZero(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact=fact*i;

        }
        int result=0;
        while (fact%10==0)
        {
            result++;
            fact=fact/10;
        }
        return result;

    }
    public static void main(String[] args) {
        Gfg08TrailingZero obj=new Gfg08TrailingZero();
        System.out.println(obj.countZero(10));
        //countZero(10);

    }
}
