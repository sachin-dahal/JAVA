package basics;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];

        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[1][0] = 3;
        matrix1[1][1] = 4;

        //System.out.println(Arrays.toString(matrix1));
        System.out.println(Arrays.deepToString(matrix1));

        System.out.println(matrix1[0].length);
    }
}
