import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] matrixN = new int[4][4];
        int[][] matrixM = new int[4][4];
        int[][] matrixL = new int[4][4];

        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < matrixN.length; i++) {
            for (int j = 0; j < matrixN.length; j++) {
         //   sum +=   matrixN[i][j] = random.nextInt(10);
                matrixN[i][j] = random.nextInt(10);
                matrixM[i][j] = random.nextInt(10);
                matrixL[i][j] = matrixN[i][j]+ matrixM[i][j];
            }
        }
        //int min = matrixN[0][0];
        //int max = matrixN[0][0];
        System.out.println(Arrays.deepToString(matrixN));
        System.out.println(Arrays.deepToString(matrixM));
        System.out.println(Arrays.deepToString(matrixL));
       // System.out.println("Sum of all element "+ sum);
     //   for (int i = 0; i < matrixN.length; i++) {
          //  for (int j = 0; j < matrixN.length; j++) {
           //     if (max < matrixN[i][j]) {
            //        max = matrixN[i][j];
                }
              //  if (min > matrixN[i][j]) {
             //       min = matrixN[i][j];
                }
            //}

   //     }

       // System.out.println("min value: " + min);
      //  System.out.println("max value: " + max);
  //  }
  //  }
