package week07.day02;

public final class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position){
        double xDistance = Math.abs(this.posX-position.getPosX());
        double yDistance = Math.abs(this.posY-position.getPosY());
        return Math.sqrt(xDistance*xDistance + yDistance*yDistance);
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
