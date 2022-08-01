package week02.day01;

public class Main {


    public static void main(String[] args) {

//        Car car = new Car();
//        car.setAddedFuel(40);
//        car.setDistance(590);
//
//        double avgConsumption = car.calculateAvgConsumption();
//
//        System.out.println("Avg Consumption is:" + avgConsumption);


        Car car = new Car();
        Car secondCar = new Car();
        GasStation gasStation = new GasStation(480);

        System.out.println("Fual in first car:" + car.getAddedFuel());

        int priceToPay = gasStation.tankCar(car, 30);

        System.out.println("Fuel in first car:"+car.getAddedFuel()+" price:"+priceToPay);
        System.out.println("Fuel in second car:"+secondCar.getAddedFuel());
        int secondCarPrice = gasStation.tankCar(secondCar, 25);
        System.out.println("Fuel in second car:"+secondCar.getAddedFuel()+ " price:"+secondCarPrice);





    }
}
