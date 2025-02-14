import java.util.Scanner;
public class Lab6Q2_4020292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int change = 0;
        System.out.print("Type 5 Numbers = ");
        int[] nums = new int[5];
        for (int i = 0; i < 5;i++) {
            nums[i] = sc.nextInt();
        }
        for (int j = 0;j < nums.length;j++) {
            for (int k = j + 1;k < nums.length; k++) {
                if (nums[j] == nums[k]) {
                    res = (nums[j]);    
                    System.out.print(res + " ");
                    change ++;
                    break;
                    }
            }
        }
        if (change == 0) {
            System.out.println(-1);
        }
    }
}