import java.util.Scanner;
public class Lab4Q4_2050292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers = ");
        int n = sc.nextInt();
        
        String[] numbs = new String[n];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = sc.next();
        }
        for (int i = 0; i < numbs.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbs[i].length(); j++) {
                sum += Character.getNumericValue(numbs[i].charAt(j));
            }
            boolean result = (sum == 9);
            System.out.println(result);
        }
    }
}
