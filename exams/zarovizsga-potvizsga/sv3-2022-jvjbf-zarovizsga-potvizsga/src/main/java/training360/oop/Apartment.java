package training360.oop;

public class Apartment {

    private static int BASIC_PRICE = 40_000;
    private int roomNumber;
    private boolean free = true;
    private FoodServiceType foodServiceType;
    private int peopleCanFit;

    public Apartment(int roomNumber, int peopleCanFit) {
        this.roomNumber = roomNumber;
        this.peopleCanFit = peopleCanFit;
        this.foodServiceType = FoodServiceType.BREAKFAST;
    }

    public boolean isFree() {
        return free;
    }

    public void rent() {
        if (!free) {
            throw new CantRentException("Not free!");
        }
        free = false;
    }

    public void upgradeService(FoodServiceType serviceType) {
        if (serviceType.getExtraPrice() <= foodServiceType.getExtraPrice()) {
            throw new IllegalArgumentException("Cannot upgrade lower or same!");
        }
        foodServiceType = serviceType;
    }

    public int getPrice() {
        return BASIC_PRICE + foodServiceType.getExtraPrice();
    }

    public FoodServiceType getFoodServiceType() {
        return foodServiceType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getPeopleCanFit() {
        return peopleCanFit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment apartment)) return false;

        return roomNumber == apartment.roomNumber;
    }

    @Override
    public int hashCode() {
        return roomNumber;
    }
}
