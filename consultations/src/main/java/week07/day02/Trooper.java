package week07.day02;

public class Trooper {


    private String name;
    private Position position = new Position(0,0);

    public Trooper(String name) {
        this.name = name;
    }

    public void changePosition(Position target){
        position = target;
    }

    public double distanceFrom(Position target){
        return position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
