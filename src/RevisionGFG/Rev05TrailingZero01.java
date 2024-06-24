package RevisionGFG;

public class Rev05TrailingZero01 {
    static int findTrailingZeros(int n)
    {
        if(n<0)
        {
            return -1;
        }
        int count=0;
        for(int i=5;n/i>=1;i*=5)
        {
            count +=n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findTrailingZeros(35));
    }
}
