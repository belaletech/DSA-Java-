package GfgA1;

public class Gfg10GCD1 {
    int gcd(int a,int b)
    {
        int result=Math.min(a,b);
        while (result>0)
        {
            if(a%result==0 && b%result==0)
            {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        Gfg10GCD1 obj=new Gfg10GCD1();
        System.out.println(obj.gcd(4,6));
    }
}
