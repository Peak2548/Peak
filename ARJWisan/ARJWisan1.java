package ARJWisan;
import java.util.Stack;

public class ARJWisan1 {
    public static void main(String[] args) {
        binomial(5); System.out.println();
        infixToPostfix("52+28*-");
    }

    static void binomial(int n) {
        String eq = "";
        String result = "";
        System.out.println("∑(k=0 to " + n + ")" + "(" + n + ", k" + ")" + " a^" + n + "-k " + "b^k");
        eq += ("a^" + n + " +");
        result += ("a^" + n + " + ");
        for (int k = 1; k < n; k++) {
            eq += (" (" + n + "," + k + ") " + "a^" + n + "-" + k + " b^" + k + " +");
            result += (nCr(n, k)) + "a^" + (n - k) + "b^" + k + " + ";
        }
        System.out.println(eq + " b^" + n);
        System.out.println(result + " b^" + n);
    }

    static int nCr(int n, int r) {
        return (fac(n)) / (fac(r) * fac(n - r));
    }

    static int fac(int n) {
        int fac;
        if (n > 0) {
            fac = n;
            for (int i = n - 1; i > 0; i--) {
                fac *= i;
            }
        } else {
            fac = 1;
        }
        return fac;
    }
    static int precedence(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    static void infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder post = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isDigit(c)) {
                post.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    post.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    post.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            post.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + post.toString());
        calculatePostfix(post.toString());
    }

    static void calculatePostfix(String postfix) {
        Stack<Double> stack = new Stack<>();

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