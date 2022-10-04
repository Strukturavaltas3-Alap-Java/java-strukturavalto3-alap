package files;

public class Product {

    private String id;
    private int price;
    private int soldCount;

    public Product(String id, int price) {
        this(id, price, 0);
    }

    public Product(String id, int price, int soldCount) {
        this.id = id;
        this.price = price;
        this.soldCount = soldCount;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public int getProfit() {
        return soldCount * price;
    }
}
