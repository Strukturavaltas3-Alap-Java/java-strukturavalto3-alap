package week03.day03.cars;

import java.util.ArrayList;
import java.util.List;

public class CarSeller {

    private String name;
    private List<Car> cars = new ArrayList<>();

    public CarSeller(String name) {
        this.name = name;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
