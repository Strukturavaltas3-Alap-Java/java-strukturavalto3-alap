package week08.day02;

import java.time.LocalTime;

public class Main {


    public static void main(String[] args) {
//        Passenger passenger = new Passenger();
//        PriorityPassenger priorityPassenger = new PriorityPassenger();
//
//       // priorityPassenger.setName("John");
//       // System.out.println(priorityPassenger.getName());
//
//
//        System.out.println(passenger.calculateBoardingTime());
//        System.out.println(priorityPassenger.calculateBoardingTime());


//        Passenger passenger = new Passenger("John",LocalTime.of(12,12));
//        PriorityPassenger priorityPassenger = new PriorityPassenger("Jane",LocalTime.of(12,12));
//        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("jack",LocalTime.of(12,12),true);
//
//
//
//        System.out.println(passenger.getName());
//        System.out.println(priorityPassenger.getName());
//        System.out.println(passenger.calculateBoardingTime());
//        System.out.println(priorityPassenger.calculateBoardingTime());
//        System.out.println(firstClassPassenger.isHasFreeFood());



//        Passenger passenger = new PriorityPassenger("John", LocalTime.of(12,12));
//
//        System.out.println(passenger.getName());
//        System.out.println(passenger.calculateBoardingTime());

        Plane plane = new Plane();
        plane.addPassenger(new Passenger("John",LocalTime.of(12,12)));
        plane.addPassenger(new Passenger("Jane",LocalTime.of(12,12)));
        plane.addPassenger(new PriorityPassenger("Jack",LocalTime.of(12,12)));
        plane.addPassenger(new Passenger("Jonathan",LocalTime.of(12,12)));
        plane.addPassenger(new FirstClassPassenger("Jill",LocalTime.of(12,12),true));

        for(Passenger actual: plane.getPassengers()){
            System.out.println(actual.calculateBoardingTime());
        }




    }

}
