package abstraction;

public class Car implements Rentable {

    private String id;

    private int distanceCanMake;

    private RentingData rentingData;

    public Car(String id, int distanceCanMake) {
        this.id = id;
        this.distanceCanMake = distanceCanMake;
    }

    public void tank(int km) {
        distanceCanMake += km;
    }

    @Override
    public void rent(User user, int km) {
        checkRentIsPossible(km);
        rentingData = new RentingData(user, km);
    }

    private void checkRentIsPossible(int km) {
        if (rentingData != null) {
            throw new IllegalStateException("The car is not available!");
        }
        if (km > distanceCanMake) {
            throw new IllegalArgumentException("Cannot make this distance: " + km);
        }
    }

    @Override
    public void closeRent() {
        if (rentingData == null) {
            throw new IllegalStateException("Vehicle is not rented!");
        }
        distanceCanMake -= rentingData.getActualKm();
        rentingData.getActualUser().addEarlierRent(this);
        rentingData = null;
    }

    @Override
    public boolean isFree() {
        return rentingData == null;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getDistanceCanMake() {
        return distanceCanMake;
    }

    public RentingData getRentingData() {
        return rentingData;
    }
}
