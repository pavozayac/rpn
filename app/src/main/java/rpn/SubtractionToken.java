package rpn;

public class SubtractionToken extends OperatorToken {
    @Override
    protected int calculate(int a, int b) {
        return a - b;
    }
}
