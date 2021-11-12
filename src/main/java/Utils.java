import com.github.curiousoddman.rgxgen.RgxGen;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public String tokenCreatorWithRgxGen() {
        RgxGen rgxGen = new RgxGen("[a-zA-Z0-9!@#$%^&*()]{" + getEnumFromScanner() + "}");
        return rgxGen.generate();
    }

    public String tokenCreatorWithASCI() {
        int tokenLength = getEnumFromScanner();
        var returnedToken = new StringBuilder();
        for (int i = 0; i < tokenLength; i++) {
            returnedToken.append(getRandomChar());
        }
        return returnedToken.toString();
    }

    private char getRandomChar() {
        Random random = new Random();
        return (char)(random.nextInt(128));
    }


    private int getEnumFromScanner() {
        System.out.print("Enter an integer specifying how many characters the token must have from the available options: ");
        returnAllEnumValues();
        int tokenLength = getIntegerFromScanner();

        while (!isContainsEnum(tokenLength)) {
            System.out.print("It's not a correct value, please type one of those:");
            returnAllEnumValues();
            tokenLength = getIntegerFromScanner();
        }
        return tokenLength;
    }

    private int getIntegerFromScanner() {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("It's not an integer number, try one more:");
        }
        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }

    private void returnAllEnumValues() {
        for (SignsQuantity c : SignsQuantity.values()) {
            System.out.print("    " + c.getCharQuantity());
        }
        System.out.println();
    }

    private boolean isContainsEnum(int number) {
        for (SignsQuantity c : SignsQuantity.values()) {
            if (c.getCharQuantity() == number) {
                return true;
            }
        }
        return false;
    }
}
