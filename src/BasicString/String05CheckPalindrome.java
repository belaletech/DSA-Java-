package BasicString;

public class String05CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("abba"));
    }

    public static boolean checkPalindrom(String str){
        int left=0,right=str.length()-1;
        while (left<right)
        {
            if(str.charAt(left)==str.charAt(right)){
                return true;
            }
        }
        return false;
    }
}
