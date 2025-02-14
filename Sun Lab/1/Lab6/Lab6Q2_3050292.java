public class Lab6Q2_3050292 {
    public static void main(String[] args) {
        String input = "KMITL";
        int begin = 1;
        int end = 4;
        String result = "";

        for (int i = begin;i < end;i++) {
            result += (input.charAt(i));
        }
        System.out.println(result);
    }
}