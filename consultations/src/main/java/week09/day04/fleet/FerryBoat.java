package week09.day04.fleet;

public class FerryBoat implements CanCarryPassengers,CanCarryGoods,Ship{


    private final CanCarryPassengers canCarryPassengers;
    private final CanCarryGoods canCarryGoods;

    public FerryBoat(int maxCargo, int maxPassengers) {
        this.canCarryPassengers = new CanCarryPassengerBehaviour(maxPassengers);
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxCargo);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
