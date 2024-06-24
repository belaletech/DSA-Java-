package InterviewQueston;

public class interviewQuestion2 {
    private static boolean isVowel(char ch)
    {
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    private static void countVowelandConsonanat(String str,int [] count)
    {
        if(str.isEmpty())
        {
            return;
        }
        char firstChar=str.charAt(0);
        if(Character.isLetter(firstChar))
        {
            if(isVowel(firstChar))
            {
                count[0]++;
            }
            else
            {
                count[1]++;
            }
        }
        countVowelandConsonanat(str.substring(1),count);
    }

    public static void main(String[] args) {
        String input="Shubham";
        int []count=new int[2];
        countVowelandConsonanat(input,count);
        System.out.println("Number of vowel "+ count[0]);
        System.out.println("Number of consonant "+count[1]);
    }



}
