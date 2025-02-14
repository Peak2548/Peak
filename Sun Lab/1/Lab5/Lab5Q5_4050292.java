import java.util.Scanner;
public class Lab5Q5_4050292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many layer = ");
        int n = sc.nextInt();
        int numLines = 4;
        int numStars = 0;
        for (int i = 0; i < n; i++) {
            numStars = (2 * i) - 1;
            for (int j = 0; j < numLines; j++) {
                for (int s = 0; s < n + numLines - i - j - 2; s++) {
                    System.out.print(" "); //add space
                }
                numStars += 2;
                for (int k = 0; k < numStars; k++) {
                    System.out.print("*");
                    } //k
        System.out.println();
                } //j
        } //i
        //Base
        for (int m = 0;m < numLines-1 ;m++) {
            for (int o = 0;o < numStars/2 - 1; o++) {
                System.out.print(" ");
            }
            for (int p = 0;p < numLines-1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
