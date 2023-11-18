package GfgA1;

public class Gfg06Factorial1 {
    public long factorial(int n)
    {
        if(n<0)
        {
            return -1;
        }
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Gfg06Factorial1 obj=new Gfg06Factorial1();
        System.out.println(obj.factorial(5));
    }
}
