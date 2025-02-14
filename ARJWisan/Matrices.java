public class Matrices {
    int[][] arr;

    public Matrices() {
        arr = new int[2][2];
    }
    public void power(int pow) {
        int[][] multiplicand = this.arr;
        int[][] multiper = this.arr;
        int[][] tmp = new int[arr.length][arr[0].length];
        
        for (int i = 0; i < pow - 1; i++) {
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    tmp[row][col] = matrixMultiply(row, col, multiper, multiplicand);
                }
            }
            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[0].length; col++) {
                    multiplicand[row][col] = tmp[row][col];
                }
            }
        }
    }
    private int matrixMultiply(int row, int col, int[][] multiper, int[][] multiplicand) {
        int result = 0;
        for (int i = 0; i < multiper.length; i++) {
            result += multiplicand[row][i] * multiper[i][col];
        }
        return result;
    }
}
