import java.util.Arrays;

public class ProFun09_Q2_050292 {
    public static void main(String[] args) {
        int[][] data = {{11,12,13,14},
                        {15,16,17,18},
                        {19,20,21,22},
                        {23,24,25,26},
                        {27,28,29,30}};
                     q2_flipHorizontal_inplace(data);
    }
    static void q2_flipHorizontal_inplace(int[][] img) {
        int[][] fliped = new int[img.length][img[0].length];
        for (int i = 0;i < img.length;i++) {
            for (int j = 0;j < img[0].length;j++) {
                fliped[img.length - i][j] = img[i][j];
            }
        }
        for (var print: fliped) {
            System.out.println(Arrays.toString(print));
        }
    }
}
