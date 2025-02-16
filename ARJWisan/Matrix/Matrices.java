import java.util.Arrays;

public class Matrices {
    private int[][] arr;

    public Matrices() {
        arr = new int[1][1];
    }

    public Matrices(int row, int col) {
        arr = new int[row][col];
    }
    
    public void addMatrix(int rowPos, int colPos, int num) {
        arr[rowPos][colPos] = num;
    }

    public int getSize() {
        return arr.length;
    }

    public void power(int po) {
        if (po == 1) {
            return;
        }
        int[][] og = arr;
        for (int i = 0; i < po - 1; i++ ) {
            timesSquareMatrix(og);
        }
    }
    private void timesSquareMatrix(int[][] multiplier) {
        int[][] newMat = new int[arr.length][arr[0].length];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                for (int k = 0; k < arr.length; k++) {
                    newMat[row][col] += arr[row][k] * multiplier[k][col];
                }
            }
        }
        arr = newMat;
    }
    public String toString() {
        for (var x : arr) {
            System.out.println(Arrays.toString(x));
        }
        return "";
    }
}