package Project;

public class recNew02 {
   public static int foo(int n,int r)
    {
        if(n>0) return (n%r+foo(n/r,r));
        else return 0;
    }

    public static void main(String[] args) {
//        recNew01 obj2=new recNew01();
        System.out.println(foo(345,10));
    }
}
