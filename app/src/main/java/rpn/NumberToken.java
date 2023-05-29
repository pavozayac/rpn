package rpn;

import java.util.Deque;

public class NumberToken implements Token {
    private int value;

    public NumberToken(int value) {
        this.value = value;
    }

    @Override
    public void evaluate(Deque<Integer> stack) {
        stack.add(this.value);
    }

    public int getValue() {
        return value;
    }
}
