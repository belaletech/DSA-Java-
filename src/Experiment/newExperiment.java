package Experiment;

import java.util.Arrays;
import java.util.Collections;
public class newExperiment {
    public static void main(String[] args) {
        int array[]={10,5,9,1,4};
        int result[]=findTopTwoScores(array);
        System.out.println(Arrays.toString(result));
    }


    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}
