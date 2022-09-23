package week09.day05.iheritance;

import week09.day05.Food;

public class Cow extends Animal{


    @Override
    public String speak() {
        return "Muuuuu";
    }

    @Override
    public boolean eat(Food food) {
        if(food!=Food.MEAT){
            setAlreadyEat(true);
            return true;
        }
        return false;
    }

    @Override
    public int numberOfLegs() {
        return 4;
    }
}
