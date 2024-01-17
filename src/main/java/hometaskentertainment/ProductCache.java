package hometaskentertainment;

import java.util.HashMap;
import java.util.Map;

public class ProductCache {
    private final Map<Long, ProductDetails> productDetailsCache = new HashMap<>();

    public ProductDetails getProductDetails(long productId) {
        // Check if the product details are already in the cache
        if (productDetailsCache.containsKey(productId)) {
            System.out.println("Fetching product details from cache for product ID: " + productId);
            return productDetailsCache.get(productId);
        }

        // If not in the cache, fetch from the database
        ProductDetails details = fetchProductDetailsFromDatabase(productId);

        // Cache the result for future requests
        productDetailsCache.put(productId, details);
        System.out.println("Fetching product details from the database for product ID: " + productId);

        return details;
    }

    private ProductDetails fetchProductDetailsFromDatabase(long productId) {
        // Simulated method to fetch product details from the database
        // In a real scenario, this might involve a database query
        return new ProductDetails(productId, "Product Name", "Description", 29.99);
    }
}

