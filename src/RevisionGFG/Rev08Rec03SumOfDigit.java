package RevisionGFG;

public class Rev08Rec03SumOfDigit {
    public static int getSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else {
            return getSum(n/10)+n%10;
        }
    }

    public static void main(String[] args) {
        System.out.println(getSum(58));
    }
}
