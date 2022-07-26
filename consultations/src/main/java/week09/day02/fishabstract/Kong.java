package week09.day02.fishabstract;

public class Kong extends Fish {

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return false;
    }

    @Override
    public void feed() {
        weight += 2;
    }
}
