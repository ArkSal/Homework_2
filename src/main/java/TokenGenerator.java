public class TokenGenerator {

    Utils utils;

    public TokenGenerator() {
        this.utils = new Utils();
    }

    //Method with 2 possible methods to create token
    public String tokenGenerator() {
        return utils.tokenCreatorWithRgxGen();
//        return utils.tokenCreatorWithASCI();
    }
}
