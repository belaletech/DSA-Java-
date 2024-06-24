package RevisionGFG;

public class Rev04CountDigit {
    public static int countDigit(int n)
    {
        int count=0;
        while (n>0)
        {
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigit(12345));
    }
}
