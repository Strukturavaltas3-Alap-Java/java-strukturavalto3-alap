package week08.day02;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}
