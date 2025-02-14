public class Lab6Q2_2050292 {
    public static void main(String[] args) {
        int segment = 0;
        String input = "10 10 10 01 10 10";
        String[] spilt_input = input.split(" ");
    
        for (int i = 0;i < spilt_input.length - 1 ;i++) {
            if (Integer.parseInt(spilt_input[i]) == (Integer.parseInt(spilt_input[i + 1])))
                segment++;
            }
        System.out.println(segment);
    }
}