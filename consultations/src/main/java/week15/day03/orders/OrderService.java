package week15.day03.orders;

import week15.day03.orders.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        orders.add(order);
    }

    //    Add vissza azokat a rendeléseket, amelyek a paraméterként megadott státuszúak
    //    és a paraméterként megadott dátummal megegyező keltezésűek!
    public List<Order> getOrdersByStatusAndDate(String status, LocalDate date) {
//        List<Order> result = new ArrayList<>();
//        for (Order o : orders) {
//            if (o.getStatus().equals(status) && o.getOrderDate().equals(date)) {
//                result.add(o);
//            }
//        }
//        return result;

        return orders.stream()
                .filter(o -> o.getStatus().equals(status) && o.getOrderDate().equals(date))
                .collect(Collectors.toList());
    }

    //    Határozd meg a rendelések darabszámát egy paraméterként kapott státusz alapján!
    public long getNumberOfOrdersByStatus(String status) {
//        int count = 0;
//        for (Order o :orders) {
//            if (o.getStatus().equals(status)) {
//                count++;
//            }
//        }
//        return count;

        return orders.stream()
                .filter(o -> o.getStatus().equals(status))
                .count();
    }

    //    Van-e olyan rendelés, amiben kevesebb mint a megadott számú termék található?
    public boolean isOrderWithProductsLessThanGiven(int numberOfProducts) {
        return orders.stream()
                .filter(order -> order.getProducts().size() < numberOfProducts)
                .findFirst()
                .isPresent();
    }

    //    Add vissza, mely napokon voltak megrendelések (a duplikátumokat szűrd ki!)
    public List<LocalDate> listOrderDates() {
        return orders.stream()
                .map(order -> order.getOrderDate())
                .distinct()
                .toList();
    }

//   Add vissza, hány terméket tartalmaz a legtöbb terméket tartalmazó rendelés!
    public int getMaxProducts() {
        return orders.stream()
                .mapToInt(order -> order.getProducts().size())
                .max()
                .orElseThrow(() -> new IllegalArgumentException("No such order"));
    }

//   Add vissza a rendeléseket egy dátum szerint sorba rendezett listában!
    public List<Order> listOrdersByOrderDate() {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate))
                .toList();
    }

//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
    public List<Order> listOrdersBeforeDate(LocalDate date) {
        List<Order> result = new ArrayList<>();
        for(Order order : orders) {
            if (order.getOrderDate().isBefore(date)) {
                result.add(order);
            }
        }
        return result;
    }

//    Alakítsd át az alábbi metódus utasításait egy stream-mé!
    public void addProductToOrders(String status, Product product) {
        for(Order order : orders) {
            if (order.getStatus().equals(status)) {
                order.addProduct(product);
            }
        }
    }

// Add vissza a paraméterként megadott kategóriájú termékeket!
// Add vissza a megadott árnál drágább termékeket!
}
