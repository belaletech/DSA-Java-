package GfgA1;

public class Gfg09TrailingZero1 {
    int countzero(int n)
    {
        int result=0;
        for(int i=5;i<=n;i=i*5)
        {
            result=result+n/i;

        }
        return result;

    }

    public static void main(String[] args) {
        Gfg09TrailingZero1 obj=new Gfg09TrailingZero1();
        System.out.println(obj.countzero(20));
    }
}
