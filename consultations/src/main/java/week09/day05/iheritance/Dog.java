package week09.day05.iheritance;

import week09.day05.Food;

public class Dog extends Animal{
    @Override
    public String speak() {
        return "Vau";
    }

    @Override
    public boolean eat(Food food) {
        if(food != Food.CHOCOLATE){
            setAlreadyEat(true);
            return true;
        }
        return false;
    }

    @Override
    public int numberOfLegs() {
        return 0;
    }
}
