import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Matrices mat = new Matrices();
        for (int i = 0; i < mat.arr.length; i++) {
            for (int j = 0; j < mat.arr[0].length; j++) {
                mat.arr[i][j] = 1;
            }
        }
        mat.power(3);
       for (var x : mat.arr) {
        System.out.println(Arrays.toString(x));
       }
    }
}