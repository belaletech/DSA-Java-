package RevisionGFG;

public class Rev01PalindromeNumber {
    public static boolean checkPalindrom(int n)
    {
        int reverse=0;
        int temp=n;
        while (temp!=0)
        {
            reverse=(reverse*10)+(temp%10);
            temp=temp/10;
        }
        return (reverse==n);
    }

    public static void main(String[] args) {

        System.out.println(checkPalindrom(121));
    }

}
