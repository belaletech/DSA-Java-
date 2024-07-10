package GFGArray;
//java code for find the second-largest element in array
public class GFGArray16largest2 {
    public static void print2largest(int arr[])
    {
        int n=arr.length;
        int i,first,second;
        //There should be at least two elements
        if(n<2)
        {
            System.out.println("invalid input");
            return;
        }
        first=second=Integer.MIN_VALUE;
        for(i=0;i<n;i++) {
            //if current element is greater than first then update both first and second
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            //if arr[i] is in between first and second update second
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
            if(second==Integer.MIN_VALUE)
            {
                System.out.println("There is no second largest value");
            }
            else {
                System.out.println("The second largest element is "+second);
            }
        }
        public static void main(String [] args)
        {
            int arr[]={12,35,1,10,34,1};
            print2largest(arr);
        }
    }


