public class Lab5Q4_1050292 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int cntW = 0;
        int cntM = 0;
        for (int i = 0;i < str.length();i++) {
            if (str.charAt(i) == 'W') {
                cntW ++;
            }
            else {
                cntM ++;
            }
        }
        System.out.println("M = " + cntM + "\n" + "W = " + cntW);
    }
    
}
