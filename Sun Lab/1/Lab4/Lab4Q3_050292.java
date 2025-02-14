class Lab4Q3_050292 {
    public static void main(String[] args) {
        int[] hrs = {2,3,4,5,20,22,123};
        int total;

        for (int i = 0;i < hrs.length;i++) {
            if (hrs[i] >= 0 && hrs[i] <= 2 ) {
                total = 4;
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if (hrs[i] > 2 && hrs[i] <= 4) {
                total = (4 + (3 * (hrs[i] - 2)));
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if (hrs[i] >= 5 && hrs[i] < 18) {
                total = (10 + (hrs[i] - 4));
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if (hrs[i] >= 18 && hrs[i] <= 24) {
                total = 24;
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if (hrs[i] % 24 != 0) {
              int tmp = (24 * (int) (hrs[i] / 24));
              if ((int) (hrs[i] % 24) >= 0 && (int) (hrs[i] % 24) <= 2 ) {
                total = tmp + 4;
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }  
            else if ((int) (hrs[i] % 24) > 2 && (int) (hrs[i] % 24) <= 4) {
                total = tmp + (4 + (3 * (hrs[i] % 24 - 2)));
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if ((int) (hrs[i] % 24) >= 5 && (int) (hrs[i] % 24) < 18) {
                total = tmp + (10 + (hrs[i] / 24 - 4));
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            else if ((int) (hrs[i] % 24) >= 18 && (int) (hrs[i] % 24) <= 24) {
                total = tmp + 24;
                System.out.println("parking for " + hrs[i] + " hrs, pay " + total + " baht");
            }
            }
        }
    }
}