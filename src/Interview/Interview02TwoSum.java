package Interview;
import java.util.Arrays;
public class Interview02TwoSum {
    public static void main(String[] args)
    {
        Interview02TwoSum obj=new Interview02TwoSum();
        int [] intArray={1,2,3,4,5,6,7,11,15,13};
        int [] result=obj.twoSum(intArray,20);
        System.out.println(Arrays.toString(result));
    }
    //Two sum
    public int[] twoSum(int[] num,int target)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No sloution found");
    }
}
