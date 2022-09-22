package week09.day04.fleet;

public class CargoShip implements Ship, CanCarryGoods {


    private final CanCarryGoods canCarryGoods;

    public CargoShip(int maxWeight) {
        this.canCarryGoods = new CanCarryGoodsBehaviour(maxWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }
}
