package week03.day03.cars;

public class Engine {

    private double engineSize;
    private String fuelType;

    public Engine(double engineSize, String fuelType) {
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }
}
