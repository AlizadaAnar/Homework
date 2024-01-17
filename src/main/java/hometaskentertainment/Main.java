package hometaskentertainment;

public class Main {
    public static void main(String[] args) {
        ProductCache productCache = new ProductCache();

        // First request for product details
        ProductDetails details1 = productCache.getProductDetails(123);

        // Subsequent request for the same product details
        ProductDetails details2 = productCache.getProductDetails(123);
    }
}
