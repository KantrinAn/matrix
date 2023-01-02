import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 7, 9},
                {2, 4, 6, 8},
                {9, 0, 1, 4}
                        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matrix[i][j] + " ");
                        }
        }
        System.out.println();
            for (int i =0; i < matrix[0].length; i++ ){
                for (int j=0; j < 3; j++){
                    System.out.print(matrix[j][i]+ " ");
                }
        }
    }
}

