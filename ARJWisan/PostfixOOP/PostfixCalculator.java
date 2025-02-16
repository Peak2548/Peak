import java.util.Stack;

public class PostfixCalculator {
    Stack<Double> stack;
    public PostfixCalculator() {
        stack = new Stack<>();
    }
    public void calPostfix(String postfix) {
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push((double) (c - '0'));
            } 
            else {
                double b = stack.pop();
                double a = stack.pop();

                switch (c) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '^': stack.push(Math.pow(a, b)); break;
                }
            }
        }
        System.out.println("Evaluated Result: " + stack.pop());
    }
}