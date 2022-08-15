package week03.day05;

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane(180); //Given
        boolean result = plane.addPassenger(new Passenger("John","FK8921",2));
        System.out.println(result);
        System.out.println("apple".substring(2, 4));

    }


}
