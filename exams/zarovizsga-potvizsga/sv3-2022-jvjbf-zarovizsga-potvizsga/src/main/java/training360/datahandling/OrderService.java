package training360.datahandling;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public long saveOrder(Order order) {
        return orderRepository.saveOrder(order);
    }

    public List<Order> getOrders() {
        return orderRepository.getOrders();
    }

    public int getMostExpensiveOrderPrice() {
        return orderRepository.getMostExpensiveOrderPrice();
    }

    public Map<String, Integer> collectProductsAndCount() {
        Map<String, Integer> result = new HashMap<>();
        List<Order> orders = orderRepository.getOrders();

        for (Order order : orders) {
            if (!result.containsKey(order.getProductName())) {
                result.put(order.getProductName(), 0);
            }
            result.put(order.getProductName(), result.get(order.getProductName()) + order.getProductCount());
        }
        return result;
    }
}
