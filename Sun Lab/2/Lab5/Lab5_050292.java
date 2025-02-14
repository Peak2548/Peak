import java.util.Arrays;

public class Lab5_050292 {
    public interface ArrayProcessor {
        public int calculate(int[] arr);
    }

    static int [] data = {28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberOfEvenElement;
    static ArrayProcessor q2IndexOfLargestEvenValue;
    static ArrayProcessor myMedian;

    static void q1() {
        q1NumberOfEvenElement = (arr) -> {
            int num = 0;
            for (int x : arr) {
                if (x % 2 == 0) {
                    num++;
                }
            }
            return num;
        };
        System.out.println("q1: " + q1NumberOfEvenElement.calculate(data));
    }
    static void q2() {
        q2IndexOfLargestEvenValue = (arr) -> {
            int idx = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max && (arr[i] % 2 == 0)) {
                    max = arr[i];
                    idx = i;
                }
            }
            return idx;
        };
        System.out.println("q2: " + q2IndexOfLargestEvenValue.calculate(data));
    }
    static void oneline() {
        int [] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = (arr) -> arr[arr.length / 2];
        System.out.println(myMedian.calculate(tmp));
}
    public static void main(String[] args) {
        q1();
        q2();
        oneline();
    }     
}
