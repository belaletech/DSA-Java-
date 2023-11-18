package GfgA1;

public class Gfg01CountDigit {
    int countDigit(int x)
    {
        int res=0;
        while (x>0)
        {
            x=x/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Gfg01CountDigit obj=new Gfg01CountDigit();
//        var result=obj.countDigit(2321);
//        countDigit(20);
        System.out.println(obj.countDigit(123));
    }
}
