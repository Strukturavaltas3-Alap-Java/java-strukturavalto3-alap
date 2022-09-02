package week06.day04;

public class Ride {

    private int day;
    private int ridePerDay;
    private int km;

    public Ride(int day, int ridePerDay, int km) {
        this.day = day;
        this.ridePerDay = ridePerDay;
        this.km = km;
    }

    public int getDay() {
        return day;
    }

    public int getRidePerDay() {
        return ridePerDay;
    }

    public int getKm() {
        return km;
    }
}
