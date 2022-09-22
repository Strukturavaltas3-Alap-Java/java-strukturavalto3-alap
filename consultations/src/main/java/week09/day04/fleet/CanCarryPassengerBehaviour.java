package week09.day04.fleet;

public class CanCarryPassengerBehaviour implements CanCarryPassengers{

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengerBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


    @Override
    public int loadPassenger(int passengers) {
       int capacity = this.maxPassengers - this.passengers;
       if(capacity>=passengers){
           this.passengers+=passengers;
           return 0;
       }
       this.passengers+=capacity;
       return passengers-capacity;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
