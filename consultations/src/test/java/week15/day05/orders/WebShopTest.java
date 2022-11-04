package week15.day05.orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WebShopTest {

    WebShop webShop;

    @BeforeEach
    void init() {
        OrderService orderService = new OrderService();

        Product p1 = new Product("Tv", "IT", 2000);
        Product p2 = new Product("Laptop", "IT", 2400);
        Product p3 = new Product("Phone", "IT", 400);
        Product p4 = new Product("Lord of The Rings", "Book", 20);
        Product p5 = new Product("Harry Potter Collection", "Book", 120);

        Order o1 = new Order("pending", LocalDate.of(2021, 6, 7));
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p5);

        Order o2 = new Order("on delivery", LocalDate.of(2021, 6, 1));
        o2.addProduct(p3);
        o2.addProduct(p1);
        o2.addProduct(p2);

        Order o3 = new Order("pending", LocalDate.of(2021, 6, 7));
        o3.addProduct(p1);
        o3.addProduct(p2);
        o3.addProduct(p5);

        Order o4 = new Order("pending", LocalDate.of(2021, 6, 1));
        o4.addProduct(p3);
        o4.addProduct(p1);
        o4.addProduct(p2);

        Order o5 = new Order("pending", LocalDate.of(2021, 6, 7));
        o5.addProduct(p1);
        o5.addProduct(p2);
        o5.addProduct(p5);
        o5.addProduct(p3);

        orderService.saveOrder(o1);
        orderService.saveOrder(o2);
        orderService.saveOrder(o3);
        orderService.saveOrder(o4);
        orderService.saveOrder(o5);

        webShop = new WebShop(orderService);
        webShop.addProduct(p1);
        webShop.addProduct(p2);
        webShop.addProduct(p3);
        webShop.addProduct(p4);
        webShop.addProduct(p5);
    }

    @Test
    void testInit() {
        Map<LocalDate, Double> expected = webShop.getIncomes();

        assertEquals(2, expected.size());
        assertEquals(9600, expected.get(LocalDate.of(2021, 6, 1)));
        assertEquals(13960, expected.get(LocalDate.of(2021, 6, 7)));

        Map<LocalDate, Double> result = Map.of(
                LocalDate.of(2021, 6, 1), 9600.0,
                LocalDate.of(2021, 6, 7), 13960.0
        );

        assertEquals(result, webShop.getIncomes());
    }

    @Test
    void testGetAveragePrice() {
        assertEquals(988, webShop.getAveragePrice());
    }

    @Test
    void testGetWholeIncome() {
        assertEquals(23560, webShop.getWholeIncome());
    }

    @Test
    void testGetOrderedProducts() {
        Set<Product> expected = webShop.getOrderedProducts();

        assertEquals(4, expected.size());
    }

    @Test
    void testGetProductsNamesAndPrices() {
        Map<String, Double> expected = webShop.getProductsNamesAndPrices();

        assertEquals(5, expected.size());
        assertTrue(expected.containsKey("Laptop"));
        assertTrue(expected.containsValue(2400.0));
    }
}