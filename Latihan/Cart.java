import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> cartItems = new HashMap<>();

    public void addToCart(Item item, int quantity) {
        cartItems.put(item, cartItems.getOrDefault(item, 0) + quantity);
    }

    public Map<Item, Integer> getCartItems() {
        return cartItems;
    }
}
