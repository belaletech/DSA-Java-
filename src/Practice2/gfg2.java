package Practice2;

public class gfg2 {
    int f(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n<=2)
        {
            return 1;
        }
        else
        {
            return f(n-1)+f(n-2)+f(n-3);
        }
    }

    public static void main(String[] args) {
        gfg2 obj=new gfg2();
        System.out.println(obj.f(7));
    }
}
