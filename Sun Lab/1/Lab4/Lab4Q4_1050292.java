import java.util.Scanner;
class Lab4Q4_1050292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        int cnt = 0;
        int i = 1;
        int n = sc.nextInt();

        while (true) {
            sum = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    sum += k;
                }
            }
            if (sum == i) {
                cnt++;
                if (cnt == n) {
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}
