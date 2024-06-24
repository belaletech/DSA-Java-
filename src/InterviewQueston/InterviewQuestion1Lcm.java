package InterviewQueston;

public class InterviewQuestion1Lcm {
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);


    }
    public static int lcm(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    public static int lcmOfArray(int [] arr)
    {
        int result=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            result=lcm(result,arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] numbers={4,6,8,10};
        int result=lcmOfArray(numbers);
        System.out.println("Lcm of the array is "+result);

    }
}

