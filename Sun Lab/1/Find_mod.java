import java.util.Scanner;
class Find_mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numerator = ");
        int a = sc.nextInt();
        System.out.print("Enter the Denominator = ");
        int b = sc.nextInt();
        int c = 0;
        // Handle if b is 0
        if (b == 0) {
            System.out.println("0 is undefined");
            return;
        }
        // Convert b to positive
        if (b < 0) {
            b = -b;
        }
        // Convert a to positive
        boolean aNeg = a < 0;
        if (aNeg) {
            a = -a;
        }
        if (a < b) {
         c = a;
           } 
           else {
            c = a - b;
            while (c >= b) {
                c = c - b;
            }
        }
        // Adjsut the sign
        if (aNeg) {
            c = -c;
        }
        System.out.println("The Remainder = " + c);
        sc.close();
        }
}
