package ARJWisan.PostfixOOP;

public class PostfixMain {
    public static void main(String[] args) {
        PostfixCalculator runner = new PostfixCalculator();
        runner.calPostfix("52+28*-");
    }
}
