package Experiment;

import java.util.Arrays;

public class Exercise {
    public int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[]arr= {1,1,2,2,3,4,5};
        Exercise obj =new Exercise();
        var result=Arrays.toString(obj.removeDuplicates(arr));
        System.out.println(result);
    }

}