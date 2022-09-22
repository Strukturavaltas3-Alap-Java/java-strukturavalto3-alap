package week09.day04.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods {

    private int cargoWeight;
    private final int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }


    @Override
    public int loadCargo(int cargoWeight) {
      int capacity = maxCargoWeight-this.cargoWeight;
      if(capacity>=cargoWeight){
          this.cargoWeight+=cargoWeight;
          return 0;
      }
      this.cargoWeight+=capacity;
      return cargoWeight-capacity;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}
