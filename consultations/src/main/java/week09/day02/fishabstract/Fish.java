package week09.day02.fishabstract;

public abstract class Fish {

    private String name;

    protected int weight;

    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean hasMemoryLoss();

    public String getStatus() {
        return name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + hasMemoryLoss();
    }

    public void feed() {
        weight++;
    }
}
