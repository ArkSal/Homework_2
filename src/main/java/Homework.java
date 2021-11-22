public class Homework {

    public static void main(String[] args) {
        TokenGenerator tokenGenerator = new TokenGenerator();
        int tokenLength = UserInputHandler.getTokenComplexityFromUser().getTokenLength();

        System.out.println("regex: " + tokenGenerator.generateWithRegex(tokenLength));
        System.out.println("ascii: " +tokenGenerator.generateWithAscii(tokenLength));
    }
}
