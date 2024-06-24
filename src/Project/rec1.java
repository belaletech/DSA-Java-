package Project;

public class rec1 {
    public int fun(int n)
    {
        if(n==0 || n==1)
            return n;
        if(n%3!=0)
            return 0;
        return fun(n/3);
    }

    public static void main(String[] args) {
        rec1 obj=new rec1();
        System.out.println(obj.fun(22));
    }
}
