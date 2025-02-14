import java.util.Arrays;

public class ProFun10_050292 {
    public static void main(String[] args) {
        int[] y = {1,2,3,2,4,2};
        System.out.println(occurrences(y, 2));

        int[] x = {1,-2, 3, 4, -5};
        negativesToZero(x);
        System.out.println(Arrays.toString(x));
    }
    public static int occurrences(int[] a, int n){
        return occurrencesHelper(a, n, 0, 0);
    }
    static int occurrencesHelper(int[] arr,int n, int idx, int cnt) {
        if (idx == arr.length) {
            return cnt;
        }
        if (arr[idx] == n) {
            cnt++;
        }
        return occurrencesHelper(arr, n, idx + 1, cnt);

    }
    public static void negativesToZero(int[] a) {
        negativesToZeroHelper(a, 0);
    }
    static void negativesToZeroHelper(int[] a, int idx) {
        if (idx == a.length) {
            return;
        }
        if (a[idx] < 0) {
            a[idx] = 0;
        }
        negativesToZeroHelper(a, idx + 1);
    }
}
