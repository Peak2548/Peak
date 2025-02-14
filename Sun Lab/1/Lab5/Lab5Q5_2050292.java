public class Lab5Q5_2050292 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < i;j++) {
            System.out.print(n - j);
          }
          System.out.println();
        }
    }
}