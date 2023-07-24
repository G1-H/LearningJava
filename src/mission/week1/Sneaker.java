package mission.week1;

public class Sneaker {
    private String brand;
    private boolean stockInStore;
    private String feature;

    private long price;

    public String getBrand() {
        return brand;
    }

    public String getFeature() {
        return feature;
    }

    public boolean isStockInStore() {
        return stockInStore;
    }

    public long getPrice() {
        return price;
    }

    public Sneaker(String brand, boolean stockInStore, String feature, long price) {
        this.brand = brand;
        this.stockInStore = stockInStore;
        this.feature = feature;
        this.price = price;
    }
}
