// import java.util.Arrays;

// class Peak {
//     public static void main(String[] args) {
//         String input = "At KMITL CHALONGKRUNG BMI MTL";
//         String[] sp_input = input.split("MI");
//         for (int i = 0;i < sp_input.length;i++) {
//             System.out.print(sp_input[i]+"CSP");
//         }
//     }
// }
class Lab7Q1 {
    public static void main(String[] args) {
        String input = "At KMITL CHALONGKRUNG BMI MTL";
        String result = "";
        for (int i = 0;i < input.length();i++ ) {
            if (input.charAt(i) == 'M' && input.charAt(i+1) == 'I') {
                result += "CSP";
                i+=2;
        }
        result += input.charAt(i);
    }
    System.out.print(result);
    }
}