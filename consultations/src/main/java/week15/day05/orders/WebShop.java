package week15.day05.orders;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WebShop {

    private Set<Product> products = new HashSet<>();

    private Map<LocalDate, Double> incomes;

    private OrderService orderService;

    public WebShop(OrderService orderService) {
        this.orderService = orderService;
        //    Adj értéket a Map-nek!
        this.incomes = orderService.getOrders().stream()
                .collect(Collectors.toMap(
                        Order::getOrderDate,
                        order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum(),
                        (value, price) -> value += price
                ));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Set<Product> getProducts() {
        return new HashSet<>(products);
    }

    public Map<LocalDate, Double> getIncomes() {
        return new HashMap<>(incomes);
    }

//    Add vissza a kapható termékek átlagárát!
    public double getAveragePrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElseThrow(() -> new IllegalArgumentException("No products"));
    }

//    Add vissza a webáruház eddigi teljes bevételét!
    public double getWholeIncome() {
        return incomes.values().stream()
                .mapToDouble(Double::valueOf)
//                .mapToDouble(income -> income)
                .sum();
    }

//    Add vissza, mely termékeket rendelték eddig meg ténylegesen!
    public Set<Product> getOrderedProducts() {
        return orderService.getOrders().stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.toSet());
    }

//    Add vissza egy Map-ben a termékek nevét és árát!
    public Map<String, Double> getProductsNamesAndPrices() {
        return products.stream()
                .collect(Collectors.toMap(
//                        product -> product.getName(),
//                        product -> product.getPrice()
                        Product::getName,
                        Product::getPrice
                ));
    }
}
