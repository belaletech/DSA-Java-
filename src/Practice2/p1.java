package Practice2;

public class p1 {
 int fun(int n)
 {
     if(n==4)
     {
         return n;
     }
     else
         return 2*fun(n+1);

 }

    public static void main(String[] args) {
       p1 obj=new p1();
        System.out.println(obj.fun(2));

    }
}
