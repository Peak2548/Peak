public class Lab6Q2_1050292 {
    public static void main(String[] args) {
        boolean isSort = true;
        int [] data1 = { 58, 4, 13, 15, 63, 9, 8, 81, 1, 78 };
        int [] data2 = { 12, 14, 16, 18, 20, 22, 23, 25, 37, 38, 39, 40 };
        for (int i =0;i < data1.length -1;i++) {
            if (data1[i] > data1[i + 1]) {
                isSort = false;
            }
        }
        System.out.println(isSort);
    }
}