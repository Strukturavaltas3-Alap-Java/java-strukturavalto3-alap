package week08.day02;

import java.time.LocalTime;

public class Passenger {

    private String name;
    private LocalTime departureTime;


    public Passenger(String name, LocalTime departureTime) {
        this.name = name;
        this.departureTime = departureTime;
    }

    public LocalTime calculateBoardingTime(){
        return departureTime.minusMinutes(15);
    }

    public String getName() {
        return name;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }


}
