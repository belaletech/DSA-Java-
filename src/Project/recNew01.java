package Project;

public class recNew01 {
    int f(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        if(n%2==0)
        {
            return f(n/2);
        }
        return f(n/2)+f(n/2+1);
    }

    public static void main(String[] args) {
        recNew01 obj=new recNew01();
        System.out.println(obj.f(11));

    }


}
