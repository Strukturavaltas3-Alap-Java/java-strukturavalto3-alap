package week09.day02.fishinterface;

public class Tang implements Fish {

    private String name;

    private int weight;

    private String color;

    public Tang(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }

    @Override
    public String getStatus() {
        return name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + hasMemoryLoss();
    }

    @Override
    public void feed() {
        weight++;
    }
}
