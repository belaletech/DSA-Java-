package RandomQuestion;
// Remove if array is sorted
public class Random02RemoveDuplicate {

    public static void removeDuplicate(int arr[]){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[j+1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        for(int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,5,5,6,8};
        removeDuplicate(arr);
    }

}
