import java.util.Scanner;
public class Lab5Q4_2050292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vow = -2;
        int no = 0;
        String str = sc.nextLine();
        for (int i = 0;i < str.length();i++) {
            if (str.toLowerCase().charAt(i) == 'a' || 
            str.toLowerCase().charAt(i) == 'e' ||str.toLowerCase().charAt(i) == 'i' || 
            str.toLowerCase().charAt(i) == 'o' ||str.toLowerCase().charAt(i) == 'u') {
                vow = i;
            }
            else {
                no = -1;
            }
        }
        if (vow >= 0) {
            System.out.println(vow);
        }
        else {
            System.out.println(no);
        }
    }
}
