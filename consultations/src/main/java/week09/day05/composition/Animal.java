package week09.day05.composition;

import week09.day05.Food;

public class Animal {

    private String speak;
    private int numberOfLegs;

    private  Diet diet;
    private boolean alreadyEat;

    public Animal(String speak, int numberOfLegs, Diet diet) {
        this.speak = speak;
        this.numberOfLegs = numberOfLegs;
        this.diet = diet;
    }

    public int speed(){
        return numberOfLegs*50;
    }

    public boolean eat(Food food){
        if(diet.canEat(food)){
            alreadyEat = true;
            return true;
        }
        return false;
    }

    public String getSpeak() {
        return speak;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean isAlreadyEat() {
        return alreadyEat;
    }
}
