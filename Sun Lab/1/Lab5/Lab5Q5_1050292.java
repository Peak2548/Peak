public class Lab5Q5_1050292 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1;i <= n;i++) {
            for (int j = 1;j <= 10;j++) {
                if (j == i || j == 10 - (i-1)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}