package RandomQuestion;

public class Random02MinValue {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 7},
                {1, 4, 6},
                {9, 2, 8}
        };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum value: " + min);

    }
}
