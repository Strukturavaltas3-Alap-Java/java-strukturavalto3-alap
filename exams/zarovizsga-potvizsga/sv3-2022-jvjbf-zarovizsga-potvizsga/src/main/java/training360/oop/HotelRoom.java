package training360.oop;

public class HotelRoom extends Apartment {

    private static int BASIC_PRICE = 20_000;
    private static int MAX_PEOPLE = 3;

    public HotelRoom(int roomNumber, int peopleCanFit) {
        super(roomNumber, peopleCanFit);
        if (peopleCanFit > MAX_PEOPLE) {
            throw new IllegalArgumentException("Cannot create room with people:" + peopleCanFit);
        }
    }

    @Override
    public int getPrice() {
        return super.getFoodServiceType().getExtraPrice() + BASIC_PRICE;
    }
}
