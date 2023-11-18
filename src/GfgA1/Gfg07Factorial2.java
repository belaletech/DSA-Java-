package GfgA1;

public class Gfg07Factorial2 {
    int factorial(int n)
    {
        int result=1;
        for(int i=2;i<=n;i++)
        {
            result *=i;

        }
        return result;
    }

    public static void main(String[] args) {
        Gfg07Factorial2 obj=new Gfg07Factorial2();
        System.out.println(obj.factorial(5));
    }
}
