package rpn;

import java.util.Deque;
import java.util.NoSuchElementException;

abstract public class OperatorToken implements Token {
    abstract protected int calculate(int a, int b);

    @Override
    public void evaluate(Deque<Integer> stack) {
        try {
            int b = stack.removeLast();
            int a = stack.removeLast();

            stack.add(calculate(a, b));
        } catch (NoSuchElementException e) {
            throw new IllegalStateException("Illegal operation in RPN string", e);
        }
    }
}
