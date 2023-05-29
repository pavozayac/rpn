package rpn;

public class Parser {
    public static Token[] parse(String line) {
        String[] parts = line.split(" ");

        Token[] tokens = new Token[parts.length];
        int i = 0;

        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                tokens[i] = new NumberToken(number);
            } catch (NumberFormatException e) {
                switch (part) {
                    case "+":
                        tokens[i] = new AdditionToken();
                        break;
                    case "-":
                        tokens[i] = new SubtractionToken();
                        break;
                    case "*":
                        tokens[i] = new MultiplicationToken();
                        break;
                    case "/":
                        tokens[i] = new DivisionToken();
                        break;
                    default:
                        throw new UnsupportedOperationException(
                                "An unsupported operation/token appeared in the sequence.", e);
                }
            }
            i++;
        }

        return tokens;
    }
}
