package consultations.w01d05;

public class Rectangle {

    private int sideA;

    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

//    public void setSideA(int sideA) {
//        this.sideA = sideA;
//    }

    public int calculateArea() {
        return sideA * sideB;
    }
}
