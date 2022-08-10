package week03.day03.cars;

public class Car {

    private String brand;
    private String type;
    private Color color;
    private Engine engine;

    public Car(String brand, String type, Color color, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }
}
