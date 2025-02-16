public class MatrixMain {
    public static void main(String[] args) {
        Matrices obj = new Matrices(2,2);
        obj.addMatrix(0, 0, 1);
        obj.addMatrix(0, 1, 0);
        obj.addMatrix(1, 0, 0);
        obj.addMatrix(1, 1, 2);
        obj.power(30);
        System.out.println(obj);
    }
}
