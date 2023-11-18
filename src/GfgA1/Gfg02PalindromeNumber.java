package GfgA1;

public class Gfg02PalindromeNumber {
    boolean isPalindrome(int n)
    {
        int rev=0;
        int temp=n;
        while (temp!=0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;

        }
        return (rev==n);
    }

    public static void main(String[] args) {
        Gfg02PalindromeNumber obj2=new Gfg02PalindromeNumber();
        System.out.println(obj2.isPalindrome(131));
    }
}
