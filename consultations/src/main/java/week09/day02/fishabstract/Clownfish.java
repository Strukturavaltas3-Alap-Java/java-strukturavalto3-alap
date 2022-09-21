package week09.day02.fishabstract;

public class Clownfish extends Fish {

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }
}
