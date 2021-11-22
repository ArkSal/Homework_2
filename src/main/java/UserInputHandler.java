import java.util.Scanner;

public class UserInputHandler {
    public static TokenComplexity getTokenComplexityFromUser() {
        TokenComplexity.printAvailableComplexityLevels();
        System.out.println("Please select available options");

        return TokenComplexity.values()[getSelectedOptionFromUser()-1];
    }

    private static int getSelectedOptionFromUser() {
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("It's not an integer number, try one more:");
        }
        int result = sc.nextInt();
        sc.nextLine();
        if (result > 0 && result < TokenComplexity.values().length + 1) {
            return result;
        } else {
            System.out.println("You selected non exiting option: " + result);
            System.out.println("Please try again");
            return getSelectedOptionFromUser();
        }
    }
}
