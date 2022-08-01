package week02.day01;

public class Car {

    private int addedFuel;
    private int distance;

    public double calculateAvgConsumption(){
        double result = (addedFuel*100./distance);
        return result;
    }

    public void setAddedFuel(int addedFuel) {
        this.addedFuel = addedFuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getAddedFuel() {
        return addedFuel;
    }

    public int getDistance() {
        return distance;
    }
}
