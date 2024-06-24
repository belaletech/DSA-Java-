package GfgA1;

public class Gfg11GCDEuclideanAlgo {
    int gcd(int a,int b)
    {
        int count=0;
        while (a!=b)

        {
             count++;
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        System.out.println(count);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Gfg11GCDEuclideanAlgo().gcd(125,1350));

    }
}
