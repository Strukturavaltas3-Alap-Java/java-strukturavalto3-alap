package week02.day01;

public class GasStation {

    private int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int tankCar(Car car, int liter){
        car.setAddedFuel(liter);
        return liter*price;
    }
}
