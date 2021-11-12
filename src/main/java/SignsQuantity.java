public enum SignsQuantity {
    PIEC(5),
    DZIESIEC(10),
    PIETNASCIE(15);

    private int charQuantity;

    SignsQuantity(int amount) {
        this.charQuantity = amount;
    }

    public int getCharQuantity() {
        return charQuantity;
    }
}
