package rpn;

public class DivisionToken extends OperatorToken {
    @Override
    protected int calculate(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Illegal division by zero.");
        }

        return a / b;
    }
}
