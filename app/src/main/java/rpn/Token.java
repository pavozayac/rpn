package rpn;

import java.util.Deque;

interface Token {
    void evaluate(Deque<Integer> stack);
}
