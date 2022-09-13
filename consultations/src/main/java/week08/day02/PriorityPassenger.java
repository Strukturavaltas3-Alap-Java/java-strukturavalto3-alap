package week08.day02;

import java.time.LocalTime;

public class PriorityPassenger extends Passenger{

//    public PriorityPassenger(){
//        super();
//    }

    public PriorityPassenger(String name, LocalTime departureTime) {
        super(name, departureTime);
    }

    @Override
    public LocalTime calculateBoardingTime() {
        return getDepartureTime().minusMinutes(30);
    }

    public void sayHy(){
        System.out.println("Hello");
    }

}
