package Project;

public class q2 {
    boolean method37(int n)
    {
        int x=n;
        int coun=0;
        while (x>0)
        {
            x=x/10;
            coun++;
        }
        for (int i=0;i<coun/2;i++)
        {
            n=n/10;
        }
        System.out.println(n%10);
        return true;
    }
    public static void main(String[] args) {
        q2 obj=new q2();
        System.out.println(obj.method37(5));
    }
}
