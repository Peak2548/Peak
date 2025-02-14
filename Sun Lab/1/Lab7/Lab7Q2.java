class Lab7Q2 {
    public static void main(String[] args) {
        System.out.println(myIndexOf("PMRQNO", "PMR"));
    }
    static int myIndexOf(String str, String sub) {
        int result = -1;
        for (int i = 0;i < str.length();i++) {
            int j = 0;
            while (j < sub.length() && str.charAt(i + j) == sub.charAt(j)) {
                j++;
            }
            if (j == sub.length()) {
                result = i;
            }
        }
        return result;
    }
}