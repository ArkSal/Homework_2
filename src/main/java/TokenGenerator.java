import com.github.curiousoddman.rgxgen.RgxGen;

import java.util.Random;

public class TokenGenerator {
    private static final int MIN_ASCII_CODE = 33;
    private static final int MAX_ASCII_CODE = 128;

    private Random random;

    public TokenGenerator() {
        random = new Random();
    }

    public String generateWithRegex(int length) {
        return new RgxGen("[a-zA-Z0-9!@#$%^&*()]{" + length + "}").generate();
    }

    public String generateWithAscii(int length) {
        var returnedToken = new StringBuilder();
        for (int i = 0; i < length; i++) {
            returnedToken.append(getRandomChar());
        }
        return returnedToken.toString();
    }

    private char getRandomChar() {
        return (char) (random.nextInt(MIN_ASCII_CODE, MAX_ASCII_CODE));
    }
}
