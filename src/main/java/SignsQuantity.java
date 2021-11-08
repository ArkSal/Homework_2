public enum SignsQuantity {

    PIEC(5),
    DZIESIEC(10),
    PIETNASCIE(15);

    int charQuantity;

    SignsQuantity(int amount) {
        this.charQuantity = amount;
    }

}
