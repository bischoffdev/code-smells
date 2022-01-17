package bloaters.largeclass;

import java.util.List;

public class WebShop {
    private List<Product> cart;

    public void addProductToCart(final Product product) {}
    public void removeProductFromCart(final Product product) {}
    public void checkOut() {}
    public void changeAddress(final Customer customer, final Address newAddress) {}
    public void enterVoucherCode() {}
    public void contactSupport() {}
    public void getDiscountedItems() {}

    private static class Product {
    }

    private static class Customer {
    }

    private static class Address {
    }
}
