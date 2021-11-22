public enum TokenComplexity {
    LOW(5),
    MEDIUM(10),
    HIGH(15);

    private final int tokenLength;

    TokenComplexity(int length) {
        this.tokenLength = length;
    }

    public int getTokenLength() {
        return tokenLength;
    }

    public static void printAvailableComplexityLevels() {
        System.out.println("Complexity options:");

        TokenComplexity[] complexities = TokenComplexity.values();

        for (int i = 0; i < complexities.length; i++) {
            System.out.println("option - " + (i + 1) + " - " + complexities[i]
                    + " number of characters: " + complexities[i].getTokenLength());
        }
    }
}
