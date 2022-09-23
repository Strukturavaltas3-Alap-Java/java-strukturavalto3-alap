package week09.day05.composition;

import week09.day05.Food;

public class NonChococlateDiet  implements Diet{


    @Override
    public boolean canEat(Food food) {
        return food != Food.CHOCOLATE;
    }
}
