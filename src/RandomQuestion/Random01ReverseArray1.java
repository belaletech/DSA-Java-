package RandomQuestion;

public class Random01ReverseArray1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int rev[]= reverseArray(arr);
        for(int i=0;i< rev.length;i++)
        {
            System.out.print(rev[i]+" ");
        }
//        System.out.println(reverseArray(arr));
    }
    public static int[] reverseArray(int arr[])
    {
        int [] arrNew=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            arrNew[j++]=arr[i];
        }
        return arrNew;
    }
}
