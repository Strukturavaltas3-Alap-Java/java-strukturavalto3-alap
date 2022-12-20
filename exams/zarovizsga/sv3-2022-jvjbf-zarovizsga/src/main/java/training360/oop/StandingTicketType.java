package training360.oop;

public enum StandingTicketType {

    FRONT_OF_STAGE(20), NORMAL(0);

    private int pricePercent;

    StandingTicketType(int pricePercent) {
        this.pricePercent = pricePercent;
    }

    public int getPricePercent() {
        return pricePercent;
    }
}
