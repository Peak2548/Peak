class Lab7Q3 {
    public static void main(String[] args) {
        System.out.println(containsAndBefore("PMRQNO", "A", "QN"));
    }
static boolean containsAndBefore(String input, String sub1, String sub2) {
    boolean result = false;
    boolean boo_j = false;
    boolean boo_k = false;
    for (int i = 0; i < input.length();i++) {
        int j = 0;
        while (j < sub1.length() && input.charAt(i + j) == sub1.charAt(j)) {
            j++;
        }
        if (j == sub1.length()) {
            boo_j = true;
        }
        int k = 0;
        while (k < sub2.length() && input.charAt(i + k) == sub2.charAt(k)) {
            k++;
        }
        if (k == sub2.length() && boo_j) {
            boo_k = true;
        }
        if (boo_k == true && boo_j == true){
            result = true;
        }
    }
    return result;
}
}