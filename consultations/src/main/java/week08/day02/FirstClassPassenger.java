package week08.day02;

import java.time.LocalTime;

public class FirstClassPassenger extends Passenger{

    private boolean hasFreeFood;


    public FirstClassPassenger(String name, LocalTime departureTime, boolean hasFreeFood) {
        super(name, departureTime);
        this.hasFreeFood = hasFreeFood;
    }

    @Override
    public LocalTime calculateBoardingTime() {
        return getDepartureTime().minusMinutes(45);
    }

    public boolean isHasFreeFood() {
        return hasFreeFood;
    }
}
