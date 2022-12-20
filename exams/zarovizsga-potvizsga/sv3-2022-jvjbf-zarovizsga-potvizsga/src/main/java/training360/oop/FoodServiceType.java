package training360.oop;

public enum FoodServiceType {

    BREAKFAST(0), BREAKFAST_DINNER(10_000), ALL_INCLUSIVE(20_000);

    private int extraPrice;

    FoodServiceType(int extraPrice) {
        this.extraPrice = extraPrice;
    }

    public int getExtraPrice() {
        return extraPrice;
    }
}
