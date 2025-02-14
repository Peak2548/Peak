package Lab;
public class Lab3Q3_67050292 {
    public static void main(String[] args) {
        int sn = 0;
            for (int i = 1; i < 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                sn +=i;
            }
        }
        System.out.println(sn);

    }
    }
