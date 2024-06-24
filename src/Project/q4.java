package Project;

public class q4 {
    public int f(int x,int y)
    {
        int z=x;
        for(int i=0;i<y;i++)
        {
            z=z-1;
        }
        return z;
    }
    public int s(int x,int y)
    {
        int z=x;
        for(int i=0;i<y;i++)
        {
            z +=1;
        }
        return f(z,y);
    }
}
