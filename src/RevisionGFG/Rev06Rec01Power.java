package RevisionGFG;

public class Rev06Rec01Power {
    static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int temp=power(x,n/2);
        temp=temp*temp;
        if(n%2==0)
        {
            return temp;
        }
        else {
            return temp*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,5));
    }
}
