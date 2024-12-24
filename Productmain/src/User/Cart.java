package User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<String, Product> cartItems;

    public Cart() {
        cartItems = new HashMap<>();
        initializeCart();
    }

    private void initializeCart() {
        Product product1 = new Product(1, "Aloe Vera Facewash", "Natural Ingredients", 1, LocalDate.parse("2023-01-01"), LocalDate.parse("2024-01-01"), 20.0);
        Product product2 = new Product(2, "Moisturizing Cream", "Hyaluronic Acid, Vitamin E", 1, LocalDate.parse("2023-02-01"), LocalDate.parse("2024-02-01"), 15.0);
        Product product3 = new Product(3, "Vitamin C Serum", "Vitamin C, Hyaluronic Acid", 1, LocalDate.parse("2023-03-01"), LocalDate.parse("2024-03-01"), 25.0);
        Product product4 = new Product(4, "Sunscreen SPF 50", "Zinc Oxide, Titanium Dioxide", 1, LocalDate.parse("2023-04-01"), LocalDate.parse("2024-04-01"), 30.0);

        cartItems.put("aloeverafacewash", product1);
        cartItems.put("moisturizingcream", product2);
        cartItems.put("vitamincserum", product3);
        cartItems.put("sunscreenspf50", product4);
    }

    public Product getProduct(String productName) {
        return cartItems.get(productName.toLowerCase().replaceAll("\\s+", ""));
    }
}
