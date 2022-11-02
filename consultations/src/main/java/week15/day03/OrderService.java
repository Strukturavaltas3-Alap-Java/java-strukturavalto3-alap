package week15.day03;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        orders.add(order);
    }

    //    Add vissza azokat a rendeléseket, amelyek a paraméterként megadott státuszúak
    //    és a paraméterként megadott dátummal megegyező keltezésűek!

    //    Határozd meg a rendelések darabszámát egy paraméterként kapott státusz alapján!

    //    Van-e olyan rendelés, amiben kevesebb mint a megadott számú termék található?

    //    Add vissza, mely napokon voltak megrendelések (a duplikátumokat szűrd ki!)
}
