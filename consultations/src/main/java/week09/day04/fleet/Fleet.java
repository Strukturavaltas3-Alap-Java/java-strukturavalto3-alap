package week09.day04.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship ship) {
        ships.add(ship);
    }

    //1000
    public void loadShip(int passengers, int cargoWeight) {
        for (Ship ship : ships) {
            if (ship instanceof CargoShip) {
                CargoShip actual = (CargoShip) ship; //100
                cargoWeight = actual.loadCargo(cargoWeight);
            }
            if (ship instanceof Liner) {
                Liner actual = (Liner) ship;
                passengers = actual.loadPassenger(passengers);
            }
            if (ship instanceof FerryBoat) {
                FerryBoat actual = (FerryBoat) ship;
                passengers = actual.loadPassenger(passengers);
                cargoWeight = actual.loadCargo(cargoWeight);
            }
            waitingCargo = cargoWeight;
            waitingPeople = passengers;
        }
    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
