package RevisionGFG;

public class Rev07Rec02Palindrome {
    public static boolean Ispalindrome(String str,int start,int end)
    {
        if(start>=end)
        {
            return true;
        }
        return (str.charAt(start)==str.charAt(end) && Ispalindrome(str,start+1,end-1) );
    }

    public static void main(String[] args) {

        System.out.println(Ispalindrome("abba",0,3));
    }
}
