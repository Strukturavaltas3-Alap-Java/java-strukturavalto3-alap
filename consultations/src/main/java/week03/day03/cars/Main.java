package week03.day03.cars;

public class Main {

    public void hy() {
        System.out.println("Hy");
    }

    public static void main(String[] args) {

        Engine engine = new Engine(1.3, "Petrol");
        Car car = new Car("Toyota", "Yaris", Color.GREY, engine);

        Car car1 = new Car("BMW", "I3", Color.BLACK, new Engine(2.0, "Diesel"));


        CarSeller carSeller = new CarSeller("Best Cars Kft.");
        carSeller.addCar(car);
        carSeller.addCar(car1);



    }
}
