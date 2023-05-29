package rpn;

public class MultiplicationToken extends OperatorToken {
    @Override
    protected int calculate(int a, int b) {
        return a * b;
    }
}
