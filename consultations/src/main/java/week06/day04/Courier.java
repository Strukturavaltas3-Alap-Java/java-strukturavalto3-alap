package week06.day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {


    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if(ride.getDay()<1 || ride.getDay()>7){
            throw new IllegalArgumentException("Day is not valid:"+ride.getDay());
        }

        if (rides.size() == 0 ) {
            if(ride.getRidePerDay()!=1) {
                throw new IllegalArgumentException("Ride not ok:"+ride.getRidePerDay());
            }
            rides.add(ride);
        } else {
            int lastDay = rides.get(rides.size() - 1).getDay();
            int lastRide = rides.get(rides.size() - 1).getRidePerDay();
            if (ride.getDay() < lastDay) {
                throw new IllegalArgumentException("Day not ok: " + ride.getDay());
            }
            if(ride.getDay()==lastDay){
                if(lastRide+1 != ride.getRidePerDay()){
                    throw new IllegalArgumentException("Ride not ok:"+ride.getRidePerDay());
                }
                rides.add(ride);
            }else{
                if(ride.getRidePerDay()!=1){
                    throw new IllegalArgumentException("Ride not ok:"+ride.getRidePerDay());
                }
                rides.add(ride);
            }
        }
    }

    public List<Ride> getRides() {
        return rides;
    }
}
