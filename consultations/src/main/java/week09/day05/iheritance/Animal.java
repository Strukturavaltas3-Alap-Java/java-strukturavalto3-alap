package week09.day05.iheritance;

import week09.day05.Food;

public abstract class Animal {

    private boolean alreadyEat;

    public abstract String speak();
    public abstract boolean eat(Food food);
    public abstract int numberOfLegs();


    public boolean isAlreadyEat() {
        return alreadyEat;
    }

    public void setAlreadyEat(boolean alreadyEat) {
        this.alreadyEat = alreadyEat;
    }
}
