package ARJWisan.Matrix;

import java.util.Arrays;

public class Matrices {
    int[][] arr;

    public Matrices(int row, int col) {
        arr = new int[row][col];
    }
    public void power(int pow) {
        if (pow == 1) return;
        int[][] result = new int[4][4];
        int[][] base = new int[4][4];
        for (int i = 0; i < 4; i++) {
            Arrays.fill(base[i], 1); // Base starts as all 1s
            result[i][i] = 1; // Identity matrix for exponentiation
        }

        while (pow > 0) {
            if (pow % 2 == 1) {
                result = multiplyMatrices(result, base);
            }
            base = multiplyMatrices(base, base);
            pow /= 2;
        }

        // Copy result back to arr
        for (int i = 0; i < 4; i++) {
            System.arraycopy(result[i], 0, arr[i], 0, 4);
        }
    }

    private int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] res = new int[4][4];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                res[row][col] = 0;
                for (int k = 0; k < 4; k++) {
                    res[row][col] += A[row][k] * B[k][col];
                }
            }
        }
        return res;
    }
    @Override
    public String toString() {
        for (var x : arr) {
            System.out.println(Arrays.toString(x));
        }
        return "";
    }
}
