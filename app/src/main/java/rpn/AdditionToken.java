package rpn;

public class AdditionToken extends OperatorToken {
    @Override
    protected int calculate(int a, int b) {
        return a + b;
    }
}
