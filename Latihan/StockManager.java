import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private Map<String, Integer> stock = new HashMap<>();

    public void addStock(String item, int quantity) {
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    public boolean isAvailable(String item, int quantity) {
        return stock.getOrDefault(item, 0) >= quantity;
    }

    public void reduceStock(String item, int quantity) {
        if (isAvailable(item, quantity)) {
            stock.put(item, stock.get(item) - quantity);
        }
    }

    public int getStock(String item) {
        return stock.getOrDefault(item, 0);
    }
}
