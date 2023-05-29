package rpn;

import java.util.Deque;

public class Evaluator {
    public static int evaluate(Deque<Integer> stack, Token[] tokens) {
        for (Token token : tokens) {
            try {
                token.evaluate(stack);
            } catch (IllegalStateException e) {
                throw new IllegalStateException("A token in the sequence could not perform its calculation", e);
            } catch (ArithmeticException e) {
                throw new IllegalStateException("The sequence in invalid as it leads to division by zero.", e);
            }
        }

        if (stack.isEmpty() || stack.size() != 1) {
            throw new IllegalStateException("The sequence is not a valid RPN operation string.");
        }

        return stack.getLast();
    }
}
