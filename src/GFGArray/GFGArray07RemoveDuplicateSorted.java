package GFGArray;
import java.util.Arrays;

public class GFGArray07RemoveDuplicateSorted {
    public static int RemoveDuplicate(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;

        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[res]) {
                res++;
                arr[res] = arr[i];
            }
        }
        return res + 1; // Length of array with unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4};
        int newLength = RemoveDuplicate(arr);
        System.out.println("Length of array after removing duplicates: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(arr, 0, newLength)));
    }
}
